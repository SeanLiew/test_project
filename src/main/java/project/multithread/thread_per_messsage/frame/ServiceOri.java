package project.multithread.thread_per_messsage.frame;

public class ServiceOri implements Service{
	public void service() {
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
