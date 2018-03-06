package project.interFinance;

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
import java.util.concurrent.Executor;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

import org.apache.log4j.Logger;
import org.json.JSONObject;

import project.interFinance.newTest.Base64;

public class HostExecutor implements Host{
	private final Executor executor;
	
	public  String path="http://auth.nifa.org.cn:9081/bankcard-service-base/v1.0/service/bankcard/verify4";
	private static String appKey = "f9b69da767de494398bac0f4f0818d47";
	private static String secret = "ueaRmtYpa2zH3b99aLjg2eJt";
	
	private static final Logger log = Logger.getLogger(HostExecutor.class);
	
	public HostExecutor (Executor executor) {
		this.executor = executor;
	}
	
	@Override
	public void request(String name, String cardNo) {
		executor.execute(new Runnable() {
			@Override
			public void run() {
			}
		});
	}

	@Override
	public void request(String name, String cardNo, String phoneNumber, String accNo) {
		executor.execute(new Runnable() {
			@Override
			public void run() {
				try{
					log.info(name);
					log.info(cardNo);
					log.info("----------------");
					String clientTime = "";
					String tranNo = UUID.randomUUID().toString().replace("-", "");
					
					String cardNo_ = encrypt3DESAndEncodeBase64(cardNo.getBytes("UTF-8"),secret);
					String name_ = encrypt3DESAndEncodeBase64(name.getBytes("UTF-8"),secret);
					String phoneNumber_ = encrypt3DESAndEncodeBase64(phoneNumber.getBytes("UTF-8"),secret);
					String accNo_ = encrypt3DESAndEncodeBase64(accNo.getBytes("UTF-8"),secret);
					
					long now = System.currentTimeMillis();
					Date d = new Date(now);
					SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddhhmm");
					clientTime = sdf.format(d);

					Map<String, String> signParameters = new HashMap<String, String>();
			        signParameters.put("appKey", appKey);
			        signParameters.put("cardNo", cardNo_);
			        signParameters.put("name", name_);
			        signParameters.put("phoneNumber", phoneNumber_);
			        signParameters.put("accNo", accNo_);
			        signParameters.put("transactionNo", tranNo);
			        signParameters.put("clientTime", clientTime);

			        String signValue=sign(signParameters,secret);
			        log.debug("sign:"+signValue);

			        JSONObject obj = new JSONObject();
			        obj.put("appKey", appKey);
			        obj.put("cardNo", cardNo_);
			        obj.put("name", name_);
			        obj.put("phoneNumber", phoneNumber_);
			        obj.put("accNo", accNo_);
			        obj.put("transactionNo", tranNo);
			        obj.put("clientTime", clientTime);
			        obj.put("sign", signValue);
			        String jsonStr = obj.toString();
			        log.debug("json:"+jsonStr);
			        byte[] data = jsonStr.getBytes();
			        
			        //开始
			        String content = name + ",'" + cardNo;
					long startTime = System.currentTimeMillis();
			        
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
			        //访问结束
					long endTime = System.currentTimeMillis();
					long responseTime = endTime - startTime;
					
					log.info("响应时间:"+ responseTime);
					
					JSONObject sendJson = new JSONObject(msg);
					log.info("返回:" + sendJson);
					String code = sendJson.get("code").toString();
					if(code.equals("0")){
						String result = sendJson.get("result").toString();
					    switch (result) {
						case "0":
							log.info(name + ", " + cardNo +",一致");
							content += " ,一致, " + responseTime + ", " + msg;
							break;
						case "1":
							log.info(name + ", " + cardNo +",不一致");
							content +=  " ,不一致, " + responseTime + ", " + msg;
							break;
						case "2":
							log.info(name + ", " + cardNo +",不存在");
							content +=  " ,不存在, " + responseTime + ", " + msg;
							break;
						default :
							log.info(name + ", " + cardNo +",其他");
							content +=  " ,其他, " + responseTime + ", " + msg;
							break;
						}
					    FileCheck.writeToFile(content);
					    return;
					}else {
						log.info("失败");
						FileCheck.writeToFile(content + " ,失败, " + responseTime + ", " + msg);
					}
				}
				catch (Exception e) {
					e.printStackTrace();
					log.error(name + ", " + cardNo + ",处理失败");
				}
			}
		});
	}
	public synchronized  String sign(Map<String, String> paramValues, String secret) throws Exception {
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
        log.debug(sb.toString());
        String signMd5 = getMD5Digest(sb.toString());
        log.debug(signMd5);
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
    public synchronized String encrypt3DESAndEncodeBase64(byte[] datasource, String password){
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
}
