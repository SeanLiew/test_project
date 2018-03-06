package project.multithread.thread_per_messsage.blackhole;

public class Blackhole {
	public static void enter(Object obj) {
		System.out.println("step 1");
		magic2(obj);
		System.out.println("step 2");
		synchronized(obj) {
			System.out.println("never reach here");
		}
	}

	private static void magic(final Object obj) {
		Thread thread = new Thread() {
			@Override
			public void run() {
				synchronized(obj) {
					synchronized(this) {
						this.setName("locked");
						this.notifyAll();
					}
					while(true) {
						//无限循环
					}
				}
			}
		};
		
		synchronized(thread) {
			thread.setName("");
			thread.start();
			while("".equals(thread.getName())) {
				try {
					thread.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	private static void magic2(final Object obj) {
		Thread thread = new Thread() {
			public void run() {
				synchronized(obj) {
					synchronized(this) {
						this.notifyAll();
					}
					try {
						this.join();		//一直等待
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			};
		};
		synchronized(thread) {
			thread.start();
			try {
				thread.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}
