package project.multithread.twophase_termination.done_latch;

import java.util.Random;
import java.util.concurrent.CountDownLatch;

public class MyTask implements Runnable {
	private final CountDownLatch downLatch;
	private final int context;
	private static final Random random = new Random(314159);
	
	public MyTask(CountDownLatch downLatch, int context) {
		this.downLatch = downLatch;
		this.context = context;
	}
	
	@Override
	public void run() {
		doTask();
		downLatch.countDown();
	}
	
	protected void doTask() {
		String name = Thread.currentThread().getName();
		System.out.println(name + ":MyTask:BEGIN:context = " + context);
		try {
			Thread.sleep(random.nextInt(3000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally {
			System.out.println(name + ":MyTask:END:context = " + context);
		}
	}

}
