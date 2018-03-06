package project.multithread.future.content;

public class AsyncContentImpl implements Content{

	private SyncContentImpl syncContent;
	
	private boolean ready = false;
	
	public synchronized void setContent(SyncContentImpl syncContent) {
		this.syncContent = syncContent;
		this.ready = true;
		notifyAll();
	}
	
	@Override
	public synchronized byte[] getBytes() {
		while(!ready) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		return syncContent.getBytes();
	}

}
