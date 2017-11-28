package project.memory;

import java.util.ArrayList;
import java.util.List;

// -XX:MetaspaceSize=8m -XX:MaxMetaspaceSize=8m -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=D:/dumps.bin
public class RuntimeConstantPoolOOM {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		int i = 0;
		while(true) {
			list.add(String.valueOf(i++).intern());
		}
	}
}
