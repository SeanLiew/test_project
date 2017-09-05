package project;

import java.util.ArrayList;
import java.util.List;

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
		String num1 = "1";
		long num2 = 1L;
		System.out.println(num1.equals(String.valueOf(num2)));
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
		int num = 100;
		System.out.println((String.valueOf(num)));
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
		String s=str1+str2;
		System.out.println(s=="javablog");
		System.out.println(s.intern()=="javablog");
		
		String s0="kvill";
		String s1=new String("kvill");
		String s2=new String("kvill");
		System.out.println(s0==s1);
		s1.intern();
		s2=s2.intern();
		System.out.println(s0==s1);
		System.out.println(s0==s1.intern());
		System.out.println(s0==s2);
	}
}
