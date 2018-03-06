package project.multithread.future.content;

import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		
		Content content1 = Retriever.retrieve("https://www.baidu.com/");
		Content content2 = Retriever.retrieve("http://sina.com/");
		Content content3 = Retriever.retrieve("https://www.tencent.com/zh-cn/index.html");
		
		saveToFile("D:/test/baidu.html", content1);
		saveToFile("D:/test/sina.html", content2);
		saveToFile("D:/test/tecnent.html", content3);

        long end = System.currentTimeMillis();

        System.out.println("Elapsed time = " + (end - start) + "msec.");
	}
	
	// 将content中的内容写入名为filename的文件中
    private static void saveToFile(String filename, Content content) {
        byte[] bytes = content.getBytes();
        try {
            System.out.println(Thread.currentThread().getName() + ": Saving to " + filename);
            FileOutputStream out = new FileOutputStream(filename);
            for (int i = 0; i < bytes.length; i++) {
                out.write(bytes[i]);
            }
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
