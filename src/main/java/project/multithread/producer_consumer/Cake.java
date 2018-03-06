package project.multithread.producer_consumer;

public class Cake {
	public static void main(String[] args) {
		Table table = new Table(3);
//		new MakerThread("maker-A", table, 12334).start();
//		new MakerThread("maker-B", table, 45678).start();
//		new MakerThread("maker-C", table, 54321).start();
//		new EaterThread("eater-I", table, 54321).start();
//		new EaterThread("eater-II", table, 54321).start();
//		new EaterThread("eater-III", table, 54321).start();
//		new ClearThread("claer-0", table).start();
		
		Thread[] threads = {
	            new MakerThread("MakerThread-1", table, 31415),
	            new MakerThread("MakerThread-2", table, 92653),
	            new MakerThread("MakerThread-3", table, 58979),
	            new EaterThread("EaterThread-1", table, 32384),
	            new EaterThread("EaterThread-2", table, 62643),
	            new EaterThread("EaterThread-3", table, 38327),
	        };

        // 启动线程
        for (int i = 0; i < threads.length; i++) {
            threads[i].start();
        }

        // 休眠约10秒
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
        }

        System.out.println("***** interrupt *****");

        // 中断
        for (int i = 0; i < threads.length; i++) {
            threads[i].interrupt();
        }
	}
}
