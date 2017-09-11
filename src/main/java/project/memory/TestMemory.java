package project.memory;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TestMemory {
	@Test
	public void testHeah() {
		List<Object> cases = new ArrayList<Object>();
		while (true) {
			cases.add(new Object());
		}
	}

	@Test
	public void testStack() {
		long i = 0;
		while (true) {
			i++;
		}
	}

	public static void main(String[] args) {
		{
			byte[] placeholder = new byte[64 * 1024 * 1024];
		}
		int i = 0;
		while (true) {
			i++;
		}
//		System.gc();
	}
}
