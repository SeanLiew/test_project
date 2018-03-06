package project.multithread.thread_per_messsage.frame;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class ServiceSingle implements Service {

	private final ThreadFactory threadFactory = Executors.defaultThreadFactory();
	
	@Override
	public void service() {
		threadFactory.newThread(new Runnable() {
			@Override
			public void run() {
				doService();
			}
		}).start();;
	}

	private static synchronized void doService() {
		System.out.println("service");
		for (int i = 0; i < 30; i++) {
			System.out.print(".");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("done.");
	}
}
