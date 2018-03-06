package project.multithread.thread_per_messsage.concurrent;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class HostScheduledExecutorService implements Host {

	private final ScheduledExecutorService scheduledExecutorService;
	
	public HostScheduledExecutorService(ScheduledExecutorService scheduledExecutorService) {
		this.scheduledExecutorService = scheduledExecutorService;
	}
	
	@Override
	public void request(int count, char c) {
		System.out.println("-->request(" + count + ", " + c + ") BEGIN");
		scheduledExecutorService.schedule(
			new Runnable() {
			@Override
			public void run() {
				helper.handle(count, c);
			}
			}, 
			3L, 
			TimeUnit.SECONDS);
		System.out.println("-->request(" + count + ", " + c + ") END");
	}

}
