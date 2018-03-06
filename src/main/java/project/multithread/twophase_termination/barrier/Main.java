package project.multithread.twophase_termination.barrier;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Main {
private static final int THREADS = 10;
	
	public static void main(String[] args) {
		System.out.println("BEGIN");
		ExecutorService service = Executors.newFixedThreadPool(THREADS);
		
		Runnable barrierAction = new Runnable() {
			@Override
			public void run() {
				System.out.println("Barrier Action!");
			}
		};
		
		CyclicBarrier phaseBarrier = new CyclicBarrier(THREADS, barrierAction);
		
		CountDownLatch downLatch = new CountDownLatch(THREADS);
		
		try {
			for (int t = 0; t < THREADS; t++) {
				service.execute(new MyTask(phaseBarrier, downLatch, t));
			}
			System.out.println("AWAIT");
			
			downLatch.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally {
			service.shutdown();
			System.out.println("END");
		}
	}
}
