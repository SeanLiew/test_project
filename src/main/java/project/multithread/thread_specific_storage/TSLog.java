package project.multithread.thread_specific_storage;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TSLog {
	private PrintWriter writer = null;
	
	public TSLog(String fileName) {
		try {
			writer = new PrintWriter(new FileWriter("D:/test/" + fileName));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//写日志
	public void println(String s) {
		writer.println(s);
	}
	
	//关闭日志
	public void close() {
		writer.println("=== end of log ===");
		writer.close();
	}
}
