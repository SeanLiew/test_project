package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import org.junit.Test;

public class ReadTxt {
	@Test
	public void test() {
		try {
			File file = new File("D:\\bank.txt");
			File sqlFile = new File("D:\\bankdata.sql");
			FileInputStream in = new FileInputStream(file);
			FileOutputStream out = new FileOutputStream(sqlFile);
			BufferedReader buffer = new BufferedReader(new InputStreamReader(in, "GB2312"));
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(out, "UTF-8"));
			String str;
			String sql = "";
			while((str = buffer.readLine())!=null){  
				String[] row = str.split("-");
				sql = "(select '" + row[0] + "', null, 0, 1, " + row[1] + " * 100, " + row[2] + " * 100, 0, null from dual)" + "\n\r" + "union all";
				writer.write(sql + "\n\r");
			}
			writer.flush();
			writer.close();
			buffer.close();
			in.close();
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
