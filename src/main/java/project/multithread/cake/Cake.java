package project.multithread.cake;

public class Cake {
	public static void main(String[] args) {
		Table table = new Table(3);
		new MakerThread("maker-A", table, 12334).start();
		new MakerThread("maker-B", table, 45678).start();
		new MakerThread("maker-C", table, 54321).start();
		new EaterThread("eater-I", table, 54321).start();
		new EaterThread("eater-II", table, 54321).start();
		new EaterThread("eater-III", table, 54321).start();
	}
}
