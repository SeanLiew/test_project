package project;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class TestList {
	public static void main(String[] args) throws Exception{
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("id", "001");
		paramMap.put("name", "Jim");
		list.add(paramMap);
		paramMap = new HashMap<String, Object>();
		paramMap.put("id", "001");
		paramMap.put("name", "John");
		list.add(paramMap);
		List<Long> listTo = oneKeyList(list, "id", Long.class);
		System.out.println(listTo);
	}
	/**
	* @Description: 取某个key组成新的list,如:List<Map<String, Object>> -->List<Long>
	* @param: list : 对象list
	* @param: key : 所取Map中的key对应的value
	* @param: clazz : 所取Map中的key对应的value的类型 
	* @return: List<T>
	 */
	@SuppressWarnings("unchecked")
	public static <T> List<T> oneKeyList(List<Map<String, Object>> list, String key, Class<T> clazz) throws Exception{
		List<Object> retList = new ArrayList<>();
		for(Map<String, Object> map : list){
			String val = String.valueOf(map.get(key));
			retList.add(cast(val, clazz));
		}
		return (List<T>) retList;
	}
	/**
	* @Description: 将val转成clazz实例对象
	* @param: val : 值
	* @param: clazz : val转成的类型类
	* @return: T
	 */
	@SuppressWarnings("unchecked")
	public static <T> T cast(String val, Class<T> clazz) throws Exception{
		String tmpClassName = clazz.getSimpleName();
		if ("String".equals(tmpClassName)) {
			return (T) val;
		} else if ("Integer".equals(tmpClassName)) {
			tmpClassName = "Int";
		}
		Method method = clazz.getDeclaredMethod("parse" + tmpClassName, String.class);
		Object obj = method.invoke(clazz, val);
		return (T) obj;
	}
}
