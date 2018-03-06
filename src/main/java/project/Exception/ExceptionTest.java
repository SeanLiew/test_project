package project.Exception;

import org.junit.Test;

public class ExceptionTest {
	
	public static void main(String[] args) throws Exception {
//		int result = testInc();
		int result = testOut();
//		String result = testException();
		System.out.println(result);
	}
	
	@SuppressWarnings("finally")
	public static String testException() throws Exception{
		try {
			thorwEx();
		} catch (Exception e) {
//			return "456";
			throw e;
		}finally {
//			throw new Exception("exIn");
			return "123";
		}
	}
	
	private static void thorwEx() throws Exception{
		throw new Exception("ex");
	}
	
	@Test
	public void test(){
		String res = null;
		try {
			res = this.testException();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(res);
	}
	
	public static int testOut() {
		int x;
		try {
			x=1;
			throw new Exception("error");
		} catch (Exception e) {
			x=2;
			return x;
		}finally {
			x=3;
		}
	}
	
	@Test
	public void testIntVoid() {
		int result = testOut();
		System.out.println(result);
	}
	
	@Test
	public static int testInc() {
		int x;
		try {
			x = 1;
			return x;
		} catch (Exception e) {
			x = 2;
			return x;
		}finally {
			x = 3;
		}
		
	}
	
}
