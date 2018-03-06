package project.newjava;

import java.util.ArrayList;
import java.util.List;

public class Behave {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Orange");
		list.add("Apple");
//		list.sort(new Comparator<String>() {
//			@Override
//			public int compare(String str1, String str2) {
//				return str1.length() - str2.length();
//			}
//		});
		
		
		list.sort((String str1, String str2) -> str1.length() - str2.length());
		System.out.println(list);
		
		System.out.println(call("aaa", (String str) -> str.length()));
	}
	
	
	public static int call(String str, StrInter strInter) {
		return strInter.toInt(str);
	}
}
