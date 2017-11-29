package project.multithread.interrupt;

public class Main {
	public static void main(String[] args) {
		Sleeper sleeper = new Sleeper();
		sleeper.start();
		System.out.println("sleeper starts");
		try {
			Thread.sleep(1000);
			System.out.println("after main sleeps 1");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		sleeper.interrupt();
		System.out.println("after main wake sleeper");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		boolean interrupted = sleeper.interrupted();
		System.out.println("interrupted=" + interrupted);
		System.out.println("after main clear sleeper interrupted");
		
	}
}
