package project.multithread.reader_writer.concurrent;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Data {
	private final char[] buffer;
	private final ReadWriteLock lock = new ReentrantReadWriteLock(true);
	private final Lock readLock = lock.readLock();
	private final Lock writeLock = lock.writeLock();
	
	public Data(int size) {
		this.buffer = new char[size];
		for (int i = 0; i < buffer.length; i++) {
			buffer[i] = '*';
		}
	}
	
	public char[] read() throws InterruptedException{
		readLock.lock();
		try {
			char[] readBuf = doRead();
			System.out.println(Thread.currentThread().getName() + " reads " + String.valueOf(readBuf));
			return readBuf;
		} finally {
			readLock.unlock();
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
		writeLock.lock();
		try {
			System.out.println(Thread.currentThread().getName() + " writes " + c);
			doWrite(c);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			writeLock.unlock();
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
