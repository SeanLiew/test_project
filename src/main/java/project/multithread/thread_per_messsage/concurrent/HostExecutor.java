package project.multithread.thread_per_messsage.concurrent;

import java.util.concurrent.Executor;

public class HostExecutor implements Host{
	private final Executor executor;
	
	public HostExecutor (Executor executor) {
		this.executor = executor;
	}
	
	@Override
	public void request(int count, char c) {
		System.out.println("-->request(" + count + ", " + c + ") BEGIN");
		executor.execute(new Runnable() {
			@Override
			public void run() {
				helper.handle(count, c);
			}
		});
		System.out.println("-->request(" + count + ", " + c + ") END");
	}

}
