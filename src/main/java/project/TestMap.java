package project;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

import org.apache.commons.beanutils.BeanUtils;
import org.junit.Test;

public class TestMap {
	@Test
	public void testReplace(){
		Map<String, Object> regularMap = new HashMap<String, Object>();
		regularMap.put("USER_NAME", "realName");
		regularMap.put("MOBILE_NUMBER", "mobileNumber");
		regularMap.put("IDENTITY_NO", "idCardNumber");
		regularMap.put("CARD_NUMBER", "bankCardNumber");
		
//		BiFunction function = new MyBiFunction();
//		regularMap.replaceAll(function);
		regularMap.replaceAll((k, v) -> {
			switch (v.toString()) {
			case "realName":
				return "";
			case "mobileNumber":
				return "";
			case "idCardNumber":
				return "";
			case "bankCardNumber":
				return "";
			default:
				return v;
			}
		});
		System.out.println(regularMap);
	}
	@Test
	public void testCopy() throws IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException{
		Map<String, Object> regularMap = new HashMap<String, Object>();
		regularMap.put("USER_NAME", "realName");
		regularMap.put("MOBILE_NUMBER", "mobileNumber");
		regularMap.put("IDENTITY_NO", "idCardNumber");
		regularMap.put("CARD_NUMBER", "bankCardNumber");
		Map<String, Object> newMap = new HashMap<String, Object>();
//		Map<String, Object> newMap = (Map<String, Object>) BeanUtils.cloneBean(regularMap);
		newMap.putAll(regularMap);
		regularMap.put("USER_NAME", "realName2");
		System.out.println("regularMap" + regularMap.toString());
		System.out.println("newMap" + newMap.toString());
	}
}
class MyBiFunction implements BiFunction<String, String, String> {

	@Override
	public String apply(String t, String u) {
		if (t != null)
			return t + u;
		else
			return u;
	}

}
