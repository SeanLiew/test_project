package project.multithread.thread_per_messsage;

public class Main {
	public static void main(String[] args) {
		System.out.println("main Begin");
		Host host = new Host();
		host.request(10, 'A');
		host.request(20, 'B');
		host.request(30, 'C');
		System.out.println("main END");
	}
}
