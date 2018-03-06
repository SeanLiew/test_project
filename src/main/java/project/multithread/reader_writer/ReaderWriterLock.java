package project.multithread.reader_writer;

public class ReaderWriterLock {
	private int readingReader = 0;
	private int waitingWriters = 0;
	private int writingWriters = 0;
	
	private boolean preferWriter = true;
	
	public synchronized void readLock() throws InterruptedException{
		while(writingWriters > 0 || (preferWriter && waitingWriters > 0)) {
//			System.out.println(Thread.currentThread().getName() + " waits ");
			wait();
		}
		readingReader++;
	}
	
	public synchronized void readUnlock() {
		readingReader--;
		preferWriter = true;
		notifyAll();
	}
	
	public synchronized void writeLock() throws InterruptedException {
		waitingWriters++;
		try {
			while(readingReader > 0 || writingWriters > 0) {
//				System.out.println(Thread.currentThread().getName() + " waits ");
				wait();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			waitingWriters--;
		}
		writingWriters++;
	}
	
	public synchronized void writeUnLock() {
		writingWriters--;
		preferWriter = false;
		notifyAll();
	}
	
}
