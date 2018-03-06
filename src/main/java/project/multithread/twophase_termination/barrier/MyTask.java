package project.multithread.twophase_termination.barrier;

import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

public class MyTask implements Runnable {
	private static final int PHASE = 5;
	
	private final CyclicBarrier phaseBarrier;
	private final CountDownLatch downLatch;
	private final int context;
	private static final Random random = new Random(314159);
	
	public MyTask(CyclicBarrier phaseBarrier, CountDownLatch downLatch, int context) {
		this.phaseBarrier = phaseBarrier;
		this.downLatch = downLatch;
		this.context = context;
	}
	
	@Override
	public void run() {
		try {
			for (int i = 0; i < PHASE; i++) {
				doPhase(i);
				phaseBarrier.await();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			e.printStackTrace();
		}finally {
			downLatch.countDown();
		}
	}
	
	private void doPhase(int phase) {
		String name = Thread.currentThread().getName();
		System.out.println(name + ":MyTask:BEGIN:context = " + context + ", phase = " + phase);
		try {
			Thread.sleep(random.nextInt(3000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally {
			System.out.println(name + ":MyTask:END:context = " + context + ", phase = " + phase);
		}
	}

}
