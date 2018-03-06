package project.multithread.reader_writer;

public class Data {
	private final char[] buffer;
	private final ReaderWriterLock lock = new ReaderWriterLock();
	public Data (int size) {
		this.buffer = new char[size];
		for (int i = 0; i < buffer.length; i++) {
			buffer[i] = '*';
		}
	}
	
	public char[] read() throws InterruptedException {
		lock.readLock();
		try {
			char[] readBuf = doRead();
			System.out.println(Thread.currentThread().getName() + " reads " + String.valueOf(readBuf));
			return readBuf;
		} finally {
			lock.readUnlock();
		}
	}
	

	private char[] doRead() {
		char[] newBuffer = new char[buffer.length];
		for (int i = 0; i < buffer.length; i++) {
			newBuffer[i] = buffer[i];
		}
		slowly();
		return newBuffer;
	}
	
	public void write(char c) throws InterruptedException {
		lock.writeLock();
		try {
			System.out.println(Thread.currentThread().getName() + " writes " + c);
			doWrite(c);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			lock.writeUnLock();
		}
	}
	
	private void doWrite(char c) {
		for (int i = 0; i < buffer.length; i++) {
			buffer[i] = c;
			slowly();
		}
	}

	private void slowly() {
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
