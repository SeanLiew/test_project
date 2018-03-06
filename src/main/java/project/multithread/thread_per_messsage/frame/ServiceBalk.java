package project.multithread.thread_per_messsage.frame;

import java.util.concurrent.Executor;

public class ServiceBalk implements Service {

	private static volatile boolean working = false;
	private final Executor executor = new Executor() {
		@Override
		public void execute(Runnable r) {
			new Thread(r).start();
		}
	};
	@Override
	public synchronized void service() {
		System.out.println("service");
		if(working) {
			System.out.println(" is balked.");
			return;
		}
		working = true;
		executor.execute(new Runnable() {
			@Override
			public void run() {
				doService();
			}
		});
	}
	
	private static void doService() {
		try {
			for (int i = 0; i < 30; i++) {
				System.out.print(".");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("done.");
		} finally {
			working = false;
		}
	}
}
