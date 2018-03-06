package project.multithread.thread_per_messsage.concurrent;


public interface  Host {
	final Helper helper = new Helper();
	
	void request(final int count, final char c);
}
