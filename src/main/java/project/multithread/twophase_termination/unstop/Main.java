package project.multithread.twophase_termination.unstop;

public class Main {
	public static void main(String[] args) {
		System.out.println("main BEGIN:");
		
		try {
			CountupThread t = new CountupThread();
			t.start();
			
			Thread.sleep(5000);
			
			System.out.println("main shutdownRequest:");
			
			t.shutdownRequest();
			
			t.join();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("main END:");
	}
}
