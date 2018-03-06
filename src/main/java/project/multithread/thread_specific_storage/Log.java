package project.multithread.thread_specific_storage;

public class Log {
	private static final ThreadLocal<TSLog> tsLogCollection = new ThreadLocal<TSLog>();
	
	public static void println(String s) {
		getTSLog().println(s);
	}
	
	public static void close() {
		getTSLog().close();
	}
	
	//获取线程持有的日志
	private static TSLog getTSLog() {
		TSLog tsLog = tsLogCollection.get();
		if(tsLog == null) {
			tsLog = new TSLog(Thread.currentThread().getName() + "-log.txt");
			tsLogCollection.set(tsLog);
			startWatcher(tsLog);
		}
		return tsLog;
		
	}
	
	private static void startWatcher(final TSLog tsLog) {
		final Thread target = Thread.currentThread();
		
		final Thread watcher = new Thread() {
			@Override
			public void run() {
				System.out.println("startWatcher for " + target.getName() + " BEGIN");
				try {
					target.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				tsLog.close();
				System.out.println("startWatcher for " + target.getName() + " END");
			}
		};
		watcher.start();
	}
}
