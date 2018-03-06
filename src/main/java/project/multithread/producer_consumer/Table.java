package project.multithread.producer_consumer;

public class Table {
	private final String[] buffer;
	private int tail;
	private int head;
	private int count;
	
	public Table(int count) {
		this.buffer = new String[count];
		this.tail = 0;
		this.head = 0;
		this.count = 0;
	}
	
	//放置蛋糕
	public synchronized void put(String cake) throws InterruptedException {
		System.out.println(Thread.currentThread().getName() + " puts" + cake);
		while(count >= buffer.length) {
			System.out.println(Thread.currentThread().getName() + " wait begin");
			wait();
			System.out.println(Thread.currentThread().getName() + " wait end");
		}
		buffer[tail] = cake;
		tail = (tail + 1) % buffer.length;
		count++;
		notifyAll();
	}
	//取蛋糕
	public synchronized String take() throws InterruptedException {
		System.out.println(Thread.currentThread().getName() + " wants to take cake");
		while(count <= 0) {
			System.out.println(Thread.currentThread().getName() + " wait begin");
			wait();
			System.out.println(Thread.currentThread().getName() + " wait end");
		}
		String cake = buffer[head];
		head = (head + 1) %  buffer.length;
		count--;
		notifyAll();
		System.out.println(Thread.currentThread().getName() + " takes " + cake);
		return cake;
		
	}
	//清理桌子
	public synchronized void clear() {
		while(count > 0) {
			try {
				Thread.currentThread().sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			String cake = buffer[head];
			System.out.println(Thread.currentThread().getName() + " clears " + cake);
			head = (head + 1) %  buffer.length;
			count--;
		}
		head = 0;
		tail = 0;
		count = 0;
		notifyAll();
	}
}
