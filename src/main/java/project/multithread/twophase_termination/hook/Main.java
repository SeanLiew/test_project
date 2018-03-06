package project.multithread.twophase_termination.hook;

public class Main {
	public static void main(String[] args) {
		System.out.println("main:BEGIN");
		Thread.setDefaultUncaughtExceptionHandler(
			new Thread.UncaughtExceptionHandler() {
				@Override
				public void uncaughtException(Thread t, Throwable e) {
					System.out.println("*****");
					System.out.println("UncaughtExceptionHandler:BEGIN");
					System.out.println("currentThread = " + Thread.currentThread());
					System.out.println("thread = " + t);
					System.out.println("exception = " + e);
					System.out.println("UncaughtExceptionHandler:END");
					
				}
			}
		);
		
		Runtime.getRuntime().addShutdownHook(
			new Thread(new Runnable() {
				@Override
				public void run() {
					System.out.println("*****");
					System.out.println("ShutdownHook:BEGIN");
					System.out.println("currentThread = " + Thread.currentThread());
					System.out.println("ShutdownHook:END");
				}
			})
		);
		
		new Thread("MyThread") {
			@Override
			public void run() {
				System.out.println("MyThread:BEGIN");
				System.out.println("MyThread:SLEEP...");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("MyThread:DEVIDE");
				int c = 1 / 0;
				System.out.println("MyThread:END");
			}
		}.start();
		
		System.out.println("main:END");
	}
}
