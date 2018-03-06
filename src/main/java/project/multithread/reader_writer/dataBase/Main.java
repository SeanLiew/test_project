package project.multithread.reader_writer.dataBase;

public class Main {
	public static void main(String[] args) {
		Database<String, String> database = new Database<String, String>();
		
		//启动AssignThread
		new AssignThread(database, "Alice", "Alaska").start();
		new AssignThread(database, "Alice", "Australia").start();
		new AssignThread(database, "Bobby", "Brazil").start();
		new AssignThread(database, "Bobby", "Bulgaria").start();
		
		//启动RetrieveThread
		for (int i = 0; i < 100; i++) {
			new RetrieveThread(database, "Alice").start();
			new RetrieveThread(database, "Bobby").start();
		}
		
		//停止 10秒
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//强制终止
		System.exit(0);
	}
}
