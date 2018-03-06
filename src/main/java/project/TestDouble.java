package project;

import org.junit.Test;

public class TestDouble {
	
	@Test
	public void testCompare(){
		double x= -30.0000000000000003;//double比较，小数点后有效位:17-(整数位)。总有效位为17位
        double y= -30.000000000000003;//17位数字
        double z= -3000.00000000000003;
        double w= -3000.0000000000003;

        System.out.println(x < y);
        System.out.println(z < w);
	}
}
