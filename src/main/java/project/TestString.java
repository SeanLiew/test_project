package project;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

import utils.StringUtil;

public class TestString {
	@Test
	public void testString(){
		List<Long> objectList = new ArrayList<Long>();
		objectList.add(9L);
		objectList.add(19L);
		objectList.add(4L);
		objectList.add(2L);
		System.out.println(StringUtil.objectListToString(objectList));
	}
	@Test
	public void testReg(){
		String role = "Agent5".replaceFirst("[0-5]+", String.valueOf(6));
		System.out.println(role);
	}
	@Test
	public void testEquals(){
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("num2", 1);
		String num1 = "1";
		System.out.println(num1.equals(params.get("num2").toString()));
	}
	@Test
	public void testGeneSql(){
		String str = "0:转入;1:转出;2:体验金收益;3:红包;4:爱e付充值;5:线下充值;6:体验金充值;7:体验金扣除;8:体验金申购;10:贷款;11:还款;12:手动转出调账;13:使用现金券;15:网银充值;18:二维码收款;20:扫码代扣;21:扫码代付;22:超时充值;25:快捷收款";
		String[] types = str.split(";");
		for (int i = 0; i < types.length; i++) {
			String[] two = types[i].split(":");
			System.out.println("when u.UBT_TYPE="+two[0]+" then '"+two[1]+"'");
		}
	}
	@Test
	public void testInt(){
		System.out.println((String.valueOf(null)));
	}
	
	@Test
	public void testEqual(){
		String str1 = "abc";
		String str2 = "abc";
		
		System.out.println("abc".substring(1));
		str2 = str2.substring(1);
		System.out.println(str1 + ":" + str2);
		String str3 = new String("abc");
		String str4 = new String("abc");
		System.out.println(str1 == str2);
		System.out.println(str3 == str4);
		System.out.println(str3.equals(str4));
		
		Integer int1 = 123;
		Integer int2 = 123;
		Integer int3 = new Integer(123);
		Integer int4 = new Integer(123);
		System.out.println(int1 == int2);
		System.out.println(int3 == int4);
		System.out.println(int3.equals(int4));
	}
	@Test
	public void testStr(){
		String str1="java";
		String str2="blog";
		String s= "javablog";
		System.out.println(str1 + str2 == "javablog");
		System.out.println(s == "javablog");
		System.out.println(s.intern() == "javablog");
		
		String s0="kvill";
		String s1=new String("kvill");
		String s2=new String("kvill");
		System.out.println(s0==s1);
		s1 = s1.intern();
		System.out.println(s0==s1);
		s2=s2.intern();
		System.out.println(s0==s2);
	}
	@Test
	public void testStr2(){
		String str1="blog";
		String str2="blog";
		System.out.println(str1 == str2);
		String s1=new String("kvill");
		String s2=new String("kvill");
		s1 = s1.intern();
		s2 = s2.intern();
		System.out.println(s1 == s2);
	}
	@Test
	public void testArray(){
		String[] str1= {"java", "oracle"};
		System.out.println(str1.toString());
	}
	@Test
	public void testSplit(){
		String str = "130896233250148109-11.23|12";
		String[] split = str.split("\\|");
		System.out.println(split.toString());
	}
	@Test
	public void testRegLogin(){
		String letterReg = "^[a-zA-Z].*";
		String numReg = "^\\d.*";
		System.out.println("letter begin : " + "saaa333".matches(letterReg));
		System.out.println("num begin : " + "93e3".matches(numReg));
	}
	@Test
	public void testRegix(){
		String letterReg = "^.*(?=.{6,30})(?=.*\\d)(?=.*[A-Z])(?=.*[a-z]).*$";
		System.out.println(Pattern.matches(letterReg, "qW1341"));
	}
}
