package project.interFinance.newTest;


import static org.junit.Assert.assertTrue;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSONObject;

public class BusinessTests {
    private static final Logger logger = LoggerFactory.getLogger(BusinessTests.class);
    public  String path="http://auth.nifa.org.cn:9081/bankcard-service-base/v1.0/service/bankcard/verify4";
    public String appKey="f9b69da767de494398bac0f4f0818d47";
    public String secret="ueaRmtYpa2zH3b99aLjg2eJt";
    
    public String cardNo="210503198601103631";
    public String name="吴迪";
    public String phoneNumber="13188230021";
    public String accNo="6217000600001181867";

    @Test
    public void testCode1() {
        logger.debug("------无效的appKey------");
        appKey="12345678901234567890123456789023";
        try {
            String msg=sendMsg(appKey,cardNo,name,phoneNumber,accNo);
            if(msg==null||msg.trim().length()==0){
                assertTrue(false);
                return;
            }
            JSONObject jsonObject=JSONObject.parseObject(msg);
            if(jsonObject.containsKey("code")
                    &&"2".equals(jsonObject.getString("code"))){
                assertTrue(true);
                return;
            }
            assertTrue(false);
            return;
        } catch (Exception e) {
            e.printStackTrace();
            assertTrue(false);
        }
    }

    @Test
    public void testCode2() {
        logger.debug("------无效的签名------");

    }

    @Test
    public void testCode0() {
        logger.debug("------正确的请求------");
        try {
            String msg=sendMsg(appKey,cardNo,name,phoneNumber,accNo);
            if(msg==null||msg.trim().length()==0){
                assertTrue(false);
                return;
            }
            JSONObject jsonObject=JSONObject.parseObject(msg);
            if(jsonObject.containsKey("code")
                    &&"0".equals(jsonObject.getString("code"))
            &&jsonObject.containsKey("result")
                    &&"0".equals(jsonObject.getString("result"))){
                assertTrue(true);
                return;
            }
            assertTrue(false);
            return;
        } catch (Exception e) {
            e.printStackTrace();
            assertTrue(false);
        }
    }



    public String sendMsg(String appKey,String cardNo,String name,String phoneNumber,
                        String accNo) throws Exception{

        cardNo=encrypt3DESAndEncodeBase64(cardNo.getBytes("UTF-8"),secret);
        name=encrypt3DESAndEncodeBase64(name.getBytes("UTF-8"),secret);
        phoneNumber=encrypt3DESAndEncodeBase64(phoneNumber.getBytes("UTF-8"),secret);
        accNo=encrypt3DESAndEncodeBase64(accNo.getBytes("UTF-8"),secret);

//        String clientTime= DateUtils.getClientTime();
        long now = System.currentTimeMillis();
        Date d = new Date(now);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddhhmm");
        String clientTime = sdf.format(d);
        String tranNo= UUID.randomUUID().toString().replace("-","");

        Map<String, String> signParameters = new HashMap<String, String>();
        signParameters.put("appKey", appKey);
        signParameters.put("cardNo", cardNo);
        signParameters.put("name", name);
        signParameters.put("phoneNumber", phoneNumber);
        signParameters.put("accNo", accNo);
        signParameters.put("transactionNo", tranNo);
        signParameters.put("clientTime", clientTime);

//        signParameters.put("sign", appKey);
        String signValue=sign(signParameters,secret);
        logger.debug("sign:"+signValue);


        JSONObject obj = new JSONObject();
        obj.put("appKey", appKey);
        obj.put("cardNo", cardNo);
        obj.put("name", name);
        obj.put("phoneNumber", phoneNumber);
        obj.put("accNo", accNo);
        obj.put("transactionNo", tranNo);
        obj.put("clientTime", clientTime);
        obj.put("sign", signValue);
        String jsonStr = obj.toJSONString();
        logger.debug("json:"+jsonStr);
        byte[] data = jsonStr.getBytes();
        java.net.URL url = new java.net.URL(path);
        java.net.HttpURLConnection conn = (java.net.HttpURLConnection) url.openConnection();
        conn.setRequestMethod("POST");
        conn.setDoOutput(true);
        conn.setRequestProperty("Connection", "keep-alive");
        conn.setRequestProperty("Content-Type", "application/json;charset=UTF-8");
        conn.setRequestProperty("Content-Length", String.valueOf(data.length));
        OutputStream outStream = conn.getOutputStream();
        outStream.write(data);
        outStream.flush();
        outStream.close();
        String msg="";
        if(conn.getResponseCode() == 200){
            BufferedReader in = new BufferedReader(new InputStreamReader((InputStream) conn.getInputStream(), "UTF-8"));
            msg = in.readLine();
            System.out.println("msg: " + msg);
            in.close();
        }
        conn.disconnect();
        return msg;
    }

    public  String sign(Map<String, String> paramValues, String secret) throws Exception {
        StringBuilder sb = new StringBuilder();
        List<String> paramNames = new ArrayList<String>(paramValues.size());
        paramNames.addAll(paramValues.keySet());
        Collections.sort(paramNames);
        sb.append(secret);
        for (String paramName : paramNames) {
            //sb.append(paramName).append(paramValues.get(paramName));
            sb.append(paramValues.get(paramName));
        }
        sb.append(secret);
        logger.debug(sb.toString());
        String signMd5 = getMD5Digest(sb.toString());
        logger.debug(signMd5);
        return signMd5;
    }
    public  String getMD5Digest(String data) {
        try {
            byte[] bytes = null;
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(data.getBytes("UTF-8"));
            bytes = md.digest();

            StringBuilder stringBuilder = new StringBuilder("");
            for (int i = 0; i < bytes.length; i++) {
                int v = bytes[i] & 0xFF;
                String hv = Integer.toHexString(v);
                if (hv.length() < 2) {
                    stringBuilder.append(0);
                }
                stringBuilder.append(hv);
            }
            return stringBuilder.toString();
        } catch (GeneralSecurityException gse) {
            return "";
        } catch (UnsupportedEncodingException e) {
            return "";
        }
    }

    /**
     * 3Des加密，返回base64字符串
     * @param datasource
     * @param password
     * @return
     */
    public String encrypt3DESAndEncodeBase64(byte[] datasource, String password){
        byte[] encryptedData = encrypt3DES(datasource,password);
        return Base64.encode(encryptedData);
    }
    /**
     * 加密
     * @param datasource byte[]
     * @param password String
     * @return byte[]
     */
    public  byte[] encrypt3DES(byte[] datasource, String password) {
        try{
            String algorithm = "DESede";
            byte[] bytePassword = password.getBytes();
            //生成密钥
            byte[] tripleDESKey = new byte[24];
            int k = 0;
            int i = 0;
            //初始化Key
            for(i = 0; i < 24; i++){
                if(k >= bytePassword.length){
                    tripleDESKey[i] = 0;
                }
                else
                    tripleDESKey[i] = bytePassword[k];
                k++;
            }
            //System.out.println("key = "+ new String(tripleDESKey,"UTF-8"));
            SecretKey deskey = new SecretKeySpec(tripleDESKey,algorithm);

            //加密
            Cipher c1 = Cipher.getInstance("DESede/ECB/PKCS5Padding");
            c1.init(Cipher.ENCRYPT_MODE, deskey);
            return c1.doFinal(datasource);
        }catch(Throwable e){
            e.printStackTrace();
            throw new IllegalArgumentException(e);
        }
    }
    /**
     * 解密
     * @param datasource byte[]
     * @param password String
     * @return byte[]
     * @throws Exception
     */
    public byte[] decrypt3DES(byte[] datasource, String password){
        try{
            String algorithm = "DESede";
            byte[] bytePassword = password.getBytes();
            //生成密钥
            byte[] tripleDESKey = new byte[24];
            int k = 0;
            int i = 0;
            //初始化Key
            for(i = 0; i < 24; i++){
                if(k >= bytePassword.length){
                    tripleDESKey[i] = 0;;
                }
                else
                    tripleDESKey[i] = bytePassword[k];
                k++;
            }
            //System.out.println("key = "+ new String(tripleDESKey,"UTF-8"));
            SecretKey deskey = new SecretKeySpec(tripleDESKey,algorithm);
            //加密
            Cipher c1 = Cipher.getInstance("DESede/ECB/PKCS5Padding");
            c1.init(Cipher.DECRYPT_MODE, deskey);
            return c1.doFinal(datasource);
        }catch(Throwable e){
            throw new IllegalArgumentException(e);
        }
    }
}
