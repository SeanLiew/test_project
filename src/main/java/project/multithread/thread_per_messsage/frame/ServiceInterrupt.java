package project.multithread.thread_per_messsage.frame;

import java.util.concurrent.ThreadFactory;

public class ServiceInterrupt implements Service {
	private static Thread worker = null;
	private final ThreadFactory threadFactory = new ThreadFactory() {
		@Override
		public Thread newThread(Runnable r) {
			return new Thread(r);
		}
	};
	
	@Override
	public synchronized void service() {
		if(worker != null && worker.isAlive()) {
			worker.interrupt();
//			try {
//				worker.join();
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
			worker = null;
		}else {
			System.out.println("service");
			worker = threadFactory.newThread(new Runnable() {
				@Override
				public void run() {
					doService();
				}
			});
			worker.start();
		}
	}
	
	private static void doService() {
		try {
			for (int i = 0; i < 30; i++) {
				System.out.print(".");
				Thread.sleep(100);
			}
			System.out.println("done.");
		} catch (InterruptedException e) {
			System.out.println("cancelled.");
		}
	}

}
