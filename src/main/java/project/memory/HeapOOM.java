package project.memory;

import java.util.ArrayList;
import java.util.List;

/**
 * -Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
 * @Title: HeapOOM.java
 * @Description: 
 * @author: Lxz
 * @date: 2017年9月11日上午9:04:41
 */
public class HeapOOM {
	static class OOMObject{}
	public static void main(String[] args) {
		List<OOMObject> list = new ArrayList<OOMObject>();
		while(true){
			list.add(new OOMObject());
		}
	}
}
