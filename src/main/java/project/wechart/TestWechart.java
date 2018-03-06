package project.wechart;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.api.common.util.HttpClientUtil;
import com.google.gson.Gson;



public class TestWechart {
	
	@Test
	public void geneAccessToken() {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("grant_type", "client_credential");
		params.put("appid", "wx4792d497b29d4013");
		params.put("secret", "df9e4ec14233941dd22a1ea5f7275274");
		String responseStr = HttpClientUtil.getInstance().doGetMap("https://api.weixin.qq.com/cgi-bin/token", params);
		System.out.println(responseStr);
	}
	@Test
	public void subscribe() {
		Gson gson = new Gson();
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("touser", "o0v8Zv2kmw1SZrcXyc01HIrJN_dg");
		params.put("template_id", "zNJ1_P9GGsCkzSdbYtykjyXgRKiAlJOZri3v2R3Zm_g");
		params.put("url", "www.baidu.com");
		params.put("scene", 1000);
		params.put("title", "信息标题");
		Map<String, Object> data = new HashMap<String, Object>();
		Map<String, Object> content = new HashMap<String, Object>();
		content.put("value", "这是通知内容");
		content.put("color", "#191970");
		data.put("content", content);
		params.put("data", data);
		String json = gson.toJson(params);
		System.out.println(json);
        byte[] bytes = json.getBytes();
		String path = "https://api.weixin.qq.com/cgi-bin/message/template/subscribe?access_token=7_CINFU_zBr9-BStsR6zrGEsizAdKKdrsx9-7eADkVqxZ9h1Wg1L0-E-J2dCnaLMcaTFr8HpuTyw-CGXsGrnfZ5ipWPFLP0rxdhtIqqyaeBOFQQMOHnEA3dx_YKWKqjkV8X0fe_kme3JnJ9gpLMUUfABACKK";
		String msg = "";
		try {
			msg = this.post(path, bytes);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("返回:" + msg);
        
	}
	
	private String post(String path, byte[] data) throws Exception {
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
            in.close();
        }
        conn.disconnect();
		return msg;
	}
}
