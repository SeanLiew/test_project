package project.multithread.cake;

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
			System.out.println(Thread.currentThread().getName() + " waits");
			wait();
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
			System.out.println(Thread.currentThread().getName() + " waits");
			wait();
		}
		String cake = buffer[head];
		head = (head + 1) %  buffer.length;
		count--;
		notifyAll();
		System.out.println(Thread.currentThread().getName() + " takes " + cake);
		return cake;
		
	}
}
