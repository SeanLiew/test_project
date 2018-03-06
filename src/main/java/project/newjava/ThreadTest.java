package project.newjava;

public class ThreadTest {
	public static void main(String[] args) {
		new Thread(() -> {
			System.out.println("qqq");
			System.out.println("eee");
		} ).start();;
	}
}
