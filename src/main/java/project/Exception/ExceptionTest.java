package project.Exception;

import org.junit.Test;

public class ExceptionTest {
	@SuppressWarnings("finally")
	public String testException(){
		try {
			thorwEx();
		} catch (Exception e) {
			throw e;
		}finally {
			return "123";
		}
	}
	
	private void thorwEx() throws Exception{
		throw new Exception("ex");
	}
	
	@Test
	public void test(){
		String res = this.testException();
		System.out.println(res);
	}
}
