package project.multithread.thread_per_messsage.concurrent;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class Main {
	public static void main(String[] args) {
		System.out.println("main Begin");
		/*Host host = new HostFactory(
			new ThreadFactory() {
				@Override
				public Thread newThread(Runnable r) {
					return new Thread(r);
				}
			}	
		);*/
		/*Host host = new HostFactory(
			Executors.defaultThreadFactory()
		);*/
		/*Host host = new HostExecutor(new Executor() {
			@Override
			public void execute(Runnable r) {
				new Thread(r).start();
			}
		});*/
		
		/*ExecutorService executorService = Executors.newCachedThreadPool();
		Host host = new HostExecutor(executorService);
		try {
			host.request(10, 'A');
			host.request(20, 'B');
			host.request(30, 'C');
		} finally {
			executorService.shutdown();
			System.out.println("main END");
		}*/
//		host.request(10, 'A');
//		host.request(20, 'B');
//		host.request(30, 'C');
//		System.out.println("main END");
		
		ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(2);
		Host host = new HostScheduledExecutorService(scheduledExecutorService);
		try {
			host.request(10, 'A');
			host.request(20, 'B');
			host.request(30, 'C');
		} finally {
			scheduledExecutorService.shutdown();
			System.out.println("main END");
		}
		
	}
}
