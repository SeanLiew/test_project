package project.multithread.reader_writer;

import java.util.Random;

public class WriterThread extends Thread {
	private static final Random random = new Random();
	
	private final Data data;
	
	private final String filer;
	
	private int index = 0;
	
	public WriterThread(Data data, String filer){
		this.data = data;
		this.filer = filer;
	}
	
	@Override
	public void run() {
		try {
			while(true) {
				char c = nextChar();
				data.write(c);
				Thread.sleep(random.nextInt(3000));
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	private char nextChar() {
		char c = filer.charAt(index);
		index++;
		if(index >= filer.length()) {
			index++;
		}
		return c;
	}
}
