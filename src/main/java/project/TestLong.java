package project;

import java.math.BigDecimal;
import java.util.concurrent.atomic.AtomicLong;

import org.junit.Test;

public class TestLong {
	public static void main(String[] args) {
		Long total = new Long("10");
		Long real = new Long("9");
		Long other = new Long("2");
		System.out.println(total != real + other);
	}
	
	@Test
	public void testCompare(){
		Long total = new Long("111199928");
		Long real = new Long("111199929");
		System.out.println(total < real);
		System.out.println(total <= real);
		System.out.println(total == real);
		System.out.println(real.longValue() == 111199929L);
		System.out.println(total.equals(real));
	}
	
	@Test
	public void testBigDecimal(){
		BigDecimal num = new BigDecimal("10.01");
		Long real = num.longValue();
		System.out.println(real);
	}
	
	@Test
	public void testInteger(){
		Long real = new Long("10");
		Integer num = new Integer("10");
		System.out.println(real * num);
		System.out.println(real <= num);
	}
	@Test
	public void testAtomic(){
		AtomicLong al = new AtomicLong(0);
		System.out.println(al.incrementAndGet());
	}
	
}
