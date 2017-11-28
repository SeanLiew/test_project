package project;

import org.junit.Test;

public class TestShort {
	@Test
	public void test() {
		Short num = new Short("1");
		
		System.out.println(num > 0);
	}
	@Test
	public void testInt() {
		Short num = new Short("1");
		
		System.out.println(num == 1);
	}
}
