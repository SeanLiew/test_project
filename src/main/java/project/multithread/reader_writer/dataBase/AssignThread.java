package project.multithread.reader_writer.dataBase;

import java.util.Random;

public class AssignThread extends Thread {
	private static Random random = new Random(314959);
	private final Database<String, String> database;
	private final String key;
	private final String value;
	
	public AssignThread(Database<String, String> database, String key, String value) {
		this.database = database;
		this.key = key;
		this.value = value;
	}
	
	@Override
	public void run() {
		while(true) {
			System.out.println(Thread.currentThread().getName() + ":assign(" + key + ", " + value + ")");
			database.assign(key, value);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
