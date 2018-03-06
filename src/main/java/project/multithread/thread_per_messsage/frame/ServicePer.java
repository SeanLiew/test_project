package project.multithread.thread_per_messsage.frame;


public class ServicePer implements Service {

	@Override
	public void service() {
		new Thread() {
			public void run() {
				doService();
			}
		}.start();
	}
	
	private static void doService() {
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
