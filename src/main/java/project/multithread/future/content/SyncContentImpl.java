package project.multithread.future.content;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

public class SyncContentImpl implements Content {

	private byte[] contentbytes;
	
	public SyncContentImpl(String urlstr) {
		System.out.println(Thread.currentThread().getName() + ": Getting " + urlstr);
		
		try {
			URL url = new URL(urlstr);
			DataInputStream in = new DataInputStream(url.openStream());
			
			byte[] buffer = new byte[1];
			int index = 0;
			
			try {
				while(true) {
					int c = in.readUnsignedShort();
					if(buffer.length <= index) {
						byte[] largerBuffer = new byte[buffer.length * 2];
						System.arraycopy(buffer, 0, largerBuffer, 0, index);
						buffer = largerBuffer;
					}
					buffer[index++] = (byte)c;
				}
			} catch (IOException e) {
//				e.printStackTrace();
			}finally {
				in.close();
			}
			contentbytes = new byte[index];
			System.arraycopy(buffer, 0, contentbytes, 0, index);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@Override
	public byte[] getBytes() {
		return contentbytes;
	}

}
