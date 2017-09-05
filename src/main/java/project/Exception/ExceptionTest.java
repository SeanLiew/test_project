package project.Exception;

import org.junit.Test;

public class ExceptionTest {
	@SuppressWarnings("finally")
	public String testException() throws Exception{
		try {
			thorwEx();
		} catch (Exception e) {
			return "456";
//			throw e;
		}finally {
			throw new Exception("exIn");
//			return "123";
		}
	}
	
	private void thorwEx() throws Exception{
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
}
