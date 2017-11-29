package project.gc;

import java.util.ArrayList;
import java.util.List;
//-Xms100m -Xmx100m -XX:+UseSerialGC
public class TestConsoleMomery {
	static class OOMObject{
		public byte[] placeholder = new byte[600 * 1024];
	}
	
	public static void fillHeap(int num) throws InterruptedException{
		List<OOMObject> list = new ArrayList<OOMObject>();
		for(int i=0; i<num; i++) {
			System.out.println("i=" + i);
			Thread.sleep(50);
			list.add(new OOMObject());
		}
		System.gc();
	}
	public static void main(String[] args) throws Exception {
		fillHeap(10000);
	}

}
