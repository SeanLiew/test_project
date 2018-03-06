package project.multithread.active_object.concurrent;

public class Main {
	public static void main(String[] args) {
		ActiveObject activeObject = ActiveObjectFactory.createObject();
		try {
			new MakerClientThread("Alice", activeObject).start();
			new MakerClientThread("Bobby", activeObject).start();
			new DisplayClientThread("Chris", activeObject).start();
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally {
			System.out.println("*** shutdown ***");
			activeObject.shutdown();
		}
	}
}
