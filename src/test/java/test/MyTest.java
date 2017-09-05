package test;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import org.junit.Test;


public class MyTest {
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Test
	public void testShort(){
		short a = 1;
		System.out.println(a==1);
		System.out.println(name);
	}
	@Test
	public void test() throws Exception{
		File file = new File("F:\\a.txt");
		File sqlFile = new File("F:\\mcc.sql");
		FileInputStream in = new FileInputStream(file);
		FileOutputStream out = new FileOutputStream(sqlFile);
		BufferedReader buffer = new BufferedReader(new InputStreamReader(in, "GB2312"));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(out, "UTF-8"));
		String str;
		String industry = "";
		int industryId = 9;
		String cateory = "";
		int cateoryId = 0;
		String merchant = "";
		int merchantId = 0;
		while((str = buffer.readLine())!=null){  
			String reStr = str.replaceAll("\\s+", "#");
			int i = reStr.lastIndexOf("#");
			String overStr = reStr.substring(0, i);
			String[] row = overStr.split("#");
			String sql = "";
			try {
				if(!industry.equals(row[3])){
					industryId += 1;
					cateoryId = 0;
					merchantId = 0;
					industry = row[3];
					sql = "insert into MERCHANT_CATEGORY_CODES (id, PARENT_ID, NAME, MCC) values ('"+geneId(industryId,cateoryId,merchantId)+"', '0', '"+industry+"','0');";
					writer.write(sql + "\n\r");
				}
			} catch (Exception e) {
				System.out.println(reStr);
				System.out.println(overStr);
				System.out.println(row[0]);
				System.out.println(row[1]);
				System.out.println(row[2]);
				e.printStackTrace();
			}
			if(!cateory.equals(row[2])){
				
				cateoryId += 1;
				merchantId = 0;
				cateory = row[2];
				sql = "insert into MERCHANT_CATEGORY_CODES (id, PARENT_ID, NAME, MCC) values ('"+geneId(industryId,cateoryId,merchantId)+"', '"+geneId(industryId,0,0)+"', '" +cateory+  "', '0');";
				writer.write(sql + "\n\r");
			}
			
			merchantId += 1;
			merchant = row[1];
			sql = "insert into MERCHANT_CATEGORY_CODES (id, PARENT_ID, NAME, MCC) values ('"+geneId(industryId,cateoryId,merchantId)+"', '"+geneId(industryId,cateoryId,0)+"', '" + merchant+  "', '" + row[0]+  "');";
			writer.write(sql + "\n\r");
			
        }  
		writer.close();
		buffer.close();
		
		
	}
	public String geneId(int... intArray){
		String result = "";
		for(int i : intArray){
			if(i<10){
				result += "0" + i; 
			}else{
				result = result + i;
			}
		}
		return result;
		
	}

}
					
				
