package project.multithread.reader_writer.concurrent;

public class ReaderThread extends Thread{
	
	private final Data data;
	
	public ReaderThread(Data data) {
		this.data = data;
	}

	@Override
	public void run() {
		try {
			while(true) {
				data.read();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
