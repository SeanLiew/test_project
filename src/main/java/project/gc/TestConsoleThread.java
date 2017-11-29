package project.gc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestConsoleThread {
	/**
	* @Description: 线程死循环演示
	 */
	public static void createBusyThread() {
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName() + "while");
				while(true) {
					System.out.println("while loop" + System.currentTimeMillis());
				}
				
			}
		}, "busyThread");
		thread.start();
	}
	
	/**
	* @Description: 线程等待演示
	 */
	public static void createLockThread(final Object lock) {
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				synchronized(lock) {
					try {
						System.out.println(Thread.currentThread().getName() + "waits");
						lock.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
			}
		}, "lockThread");
		thread.start();
	}
	
	/**
	 * @Description: 演示死锁
	 */
	static class SynAddRunnable implements Runnable{
		int a, b;
		
		public SynAddRunnable(int a, int b) {
			this.a = a;
			this.b = b;
		}
		@Override
		public void run() {
			synchronized (Integer.valueOf(a)) {
				synchronized (Integer.valueOf(b)) {
					System.out.println(a + b);
				}
			}
		}
		
	}
	
	public static void main(String[] args) throws Exception {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		br.readLine();
//		createBusyThread();
//		br.readLine();
//		Object obj = new Object();
//		createLockThread(obj);
		
		for (int i = 0; i < 100; i++) {
			new Thread(new SynAddRunnable(1, 2)).start();
			new Thread(new SynAddRunnable(2, 1)).start();
		}
	}
}
