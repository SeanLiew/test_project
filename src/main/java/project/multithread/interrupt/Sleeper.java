package project.multithread.interrupt;

public class Sleeper extends Thread {
	public void run() {
		try {
			System.out.println("before Sleeper sleeps");
			Thread.sleep(86400000);
			System.out.println("after  Sleeper sleeps");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(" after Sleeper interrupted");
		
		try {
			System.out.println("before Sleeper sleeps again");
			Thread.sleep(86400000);
			System.out.println("after Sleeper sleeps again");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
