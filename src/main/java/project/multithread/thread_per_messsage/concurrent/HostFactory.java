package project.multithread.thread_per_messsage.concurrent;

import java.util.concurrent.ThreadFactory;

public class HostFactory implements Host{
	private final ThreadFactory threadFactory;
	
	public HostFactory(ThreadFactory threadFactory) {
		this.threadFactory = threadFactory;
	}
	
	public void request(final int count, final char c) {
		System.out.println("-->request(" + count + ", " + c + ") BEGIN");
		threadFactory.newThread(
			new Runnable() {
				@Override
				public void run() {
					helper.handle(count, c);
				}
			}
		).start();
		System.out.println("-->request(" + count + ", " + c + ") END");
	}
}
