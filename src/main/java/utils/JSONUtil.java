package utils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import enums.CodeEnum;
import net.sf.json.JSONArray;
import net.sf.json.JSONNull;
import net.sf.json.JSONObject;
import net.sf.json.xml.XMLSerializer;

/**
 * JSON工具类
 * 
 * @author chengzhen.zhang
 * @version 1.0.0
 */
public final class JSONUtil {
	
	private static Log log = LogFactory.getLog(JSONUtil.class);

	public static final JSONObject processSuccessJson(Object obj) {
		JSONObject jsObj = new JSONObject();
		jsObj.put("code", CodeEnum.SUCCESS.code());
		if (obj == null) {
			jsObj.put("result", "");
		} else {
			jsObj.put("result", JSONObject.fromObject(obj).toString());
		}
		jsObj.put("message", "");
		log.info("请求成功:返回"+String.valueOf(obj));
		return jsObj;
	}

	public static final JSONObject processSuccessJsonByMsg(String msg) {
		JSONObject jsObj = new JSONObject();
		jsObj.put("code", CodeEnum.SUCCESS.code());
		jsObj.put("result", "");
		jsObj.put("message", msg);
		return jsObj;
	}
	
	public static final JSONObject processSuccessJsonByMap(Map<String,Object> resultMap,String msg) {
		JSONObject jsObj = new JSONObject();
		jsObj.put("code", CodeEnum.SUCCESS.code());
		jsObj.put("result", JSONObject.fromObject(resultMap).toString());
		jsObj.put("message", msg);
		return jsObj;
	}

	public static final JSONObject processSuccessArrayJson(List<Map<String, Object>> list) {
		JSONObject jsObj = new JSONObject();
		JSONArray array = JSONArray.fromObject(list);
		jsObj.put("code", CodeEnum.SUCCESS.code());
		jsObj.put("result", array);
		jsObj.put("message", "");
		return jsObj;
	}

	public static final JSONObject processFailedJson(int code, String msg) {
		JSONObject jsObj = new JSONObject();
		jsObj.put("code", code);
		jsObj.put("result", "");
		jsObj.put("message", msg);
		return jsObj;
	}
	
	public static final JSONObject processFailedJson(String code, String msg) {
		JSONObject jsObj = new JSONObject();
		jsObj.put("code", code);
		jsObj.put("result", "");
		jsObj.put("message", msg);
		return jsObj;
	}
	
	public static final JSONObject processSuccessJson(int code, String msg) {
		JSONObject jsObj = new JSONObject();
		jsObj.put("code", code);
		jsObj.put("result", "");
		jsObj.put("message", "");
		return jsObj;
	}
	
	/** 
	 * 将xml字符串转换为JSON对象 
	 * @param xmlFile xml字符串 
	 * @return JSON对象 
	 */  
	public static JSONObject getJSONFromXml(String xmlString) {  
	    XMLSerializer xmlSerializer = new XMLSerializer();  
	    JSONObject json = (JSONObject) xmlSerializer.read(xmlString);  
	    return json;  
	}  
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static JSONObject map2JsonObj(Map map) {
		// 转换null
		Iterator it = map.keySet().iterator();
		while (it.hasNext()) {
			String key = (String) it.next();
			Object value = map.get(key);
			if (value == null) {
				map.put(key, "");
			}
		}
		
		JSONObject j = JSONObject.fromObject(map);
		return j;
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static String map2Json(Map map) {
		// 转换null
		Iterator it = map.keySet().iterator();
		while (it.hasNext()) {
			String key = (String) it.next();
			Object value = map.get(key);
			if (value == null) {
				map.put(key, "");
			}
		}
		
		JSONObject j = JSONObject.fromObject(map);
		return j.toString();
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static Map jsonArrayToMap(String json) { 		
		Map classMap = new HashMap();
		classMap.put("map", Map.class);
		Map map = (Map)JSONObject.toBean(JSONObject.fromObject(json), Map.class, classMap);
		// 转换null
		Iterator it=map.keySet().iterator();
		while(it.hasNext()){
			String key = (String)it.next();
			Object value = map.get(key);
			if (value == null) {
				map.put(key, "");
			}
			if (value instanceof JSONNull) {
				map.put(key, "");
			}
			if (value instanceof ArrayList) {
				List list = (ArrayList)value;
				StringBuffer sb = new StringBuffer();
				for(int i = 0 ;i<list.size();i++){
					if(i==0){
						sb.append(list.get(i));
					}else{
						sb.append(";"+list.get(i));
					}
				}
				map.put(key,sb.toString() );
			}
		}
		return map;
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	//String 转成Map
	public static Map String2Map(String responseStr){
		Map hashMap = new HashMap();
		String[] values= null;
		if(responseStr.contains("&")){
			values = responseStr.split("&");
		}else if(responseStr.contains(",")){
			values = responseStr.split(",");
		}
		for (String value : values) {
			String[] ms = value.split("=");
			if(ms.length==2){
				hashMap.put(ms[0], ms[1]);
			}else if(ms.length==1){
				hashMap.put(ms[0], "");
			}
		}
		return hashMap;
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static Map jsonToMap(String json){
		ObjectMapper mapper = new ObjectMapper();
		Map map = null;
		try {
			map = mapper.readValue(json, Map.class);
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		Map classMap = new HashMap();
//		classMap.put("map", Map.class);
//		Map map = (Map)JSONObject.toBean(JSONObject.fromObject(json), Map.class, classMap);
		// 转换null
		Iterator it=map.keySet().iterator();
		while(it.hasNext()){
			String key = (String)it.next();
			Object value = map.get(key);
			if (value == null) {
				map.put(key, null);
			}
			if (value instanceof JSONNull) {
				map.put(key, null);
			}
		}
		return map;
	}
	
//	public static void main(String[] args) {
//		String xmlString = "<?xml version=\"1.0\" encoding=\"GBK\" ?><BOSEBankData><opRep><serialNo>65801444637803604</serialNo><retCode>be0020105</retCode><errMsg>客户付款帐号不存在</errMsg><opResult><RECO></RECO><REMG></REMG></opResult></opRep></BOSEBankData>";
//		JSON json = getJSONFromXml(xmlString);
//		System.out.println(json.toString());
//		JSONObject jobj = (JSONObject) json;
//		System.out.println(jobj.getJSONObject("opRep").get("errMsg"));
//	}

}