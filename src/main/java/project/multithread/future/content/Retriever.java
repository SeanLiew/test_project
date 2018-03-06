package project.multithread.future.content;

public class Retriever {
	public static Content retrieve(String urlStr) {
		final AsyncContentImpl future = new AsyncContentImpl();
		
		new Thread() {
			@Override
			public void run() {
				future.setContent(new SyncContentImpl(urlStr));
			}
		}.start();
		
		return new SyncContentImpl(urlStr);
	}
}
