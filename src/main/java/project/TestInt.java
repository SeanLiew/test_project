package project;

import org.junit.Test;

public class TestInt {
	@Test
	public void testInt(){
		String num = "1.0";
		int result = Integer.parseInt(String.valueOf(num));
		System.out.println(result);
	}
	
}
