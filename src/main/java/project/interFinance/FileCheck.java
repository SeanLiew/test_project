package project.interFinance;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

import org.apache.log4j.Logger;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Cell;
import org.junit.Test;
import org.springframework.util.StringUtils;


public class FileCheck {
	
	private static final Logger log = Logger.getLogger(FileCheck.class);
	
	private static OutputStreamWriter out = null;
	
	static volatile Long allResponsetime = 0L;
	
	public static AtomicInteger count = new AtomicInteger();
	
	{
		try {
			out = new OutputStreamWriter(new FileOutputStream("D:/test/四要素校验结果-100-2.csv"),"gb2312");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testRealName() {
		String infile = "D:/test/test100.xls";
		
		POIFSFileSystem fs;
	    HSSFWorkbook wb;
	    HSSFSheet sheet;
	    HSSFRow row;
	    
	    ExecutorService executorService = null;
	    
		try {
        	InputStream is = new FileInputStream(infile);
            fs = new POIFSFileSystem(is);
            wb = new HSSFWorkbook(fs);
	        
	        sheet = wb.getSheetAt(0);
	        // 得到总行数
	        int rowNum = sheet.getLastRowNum();
	        row = sheet.getRow(0);
	        // 正文内容应该从第二行开始,第一行为表头的标题
	        String userName = "", idenNum = "", mobile = "", bankCard = "";
	        executorService = Executors.newFixedThreadPool(20);
			Host host = new HostExecutor(executorService);
	        for (int i = 1; i <= rowNum; i++) {
	            row = sheet.getRow(i);
	            userName = row.getCell(1).getRichStringCellValue().getString();
	            idenNum = this.getCellValue(row.getCell(2));
	            mobile = this.getCellValue(row.getCell(3));
	            bankCard = this.getCellValue(row.getCell(5));
	            log.info(i+" >>当前处理,userName=" + userName);
	            if(!StringUtils.isEmpty(userName)) {
	            	count.incrementAndGet();
	            	host.request(userName, idenNum, mobile, bankCard);
	            }
	        }
        	while(count.intValue() != 0) {
        		
        	}	
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			executorService.shutdown();
		}
	}
	private String getCellValue(Cell cell) {
		switch (cell.getCellType()) {
		
		case Cell.CELL_TYPE_NUMERIC:
			return  String.valueOf(((Double)cell.getNumericCellValue()).longValue());
			
		case Cell.CELL_TYPE_STRING:
			return cell.getRichStringCellValue().getString();
			
		case Cell.CELL_TYPE_BLANK:
			return null;
			
		default:
			throw new RuntimeException("格式错误");
		}
	}
	public synchronized static void writeToFile(String content) {
		try {
			out.write(content+"\n");
			out.flush();
			count.decrementAndGet();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(count.intValue() == 0) {
				log.info(" ---end start-- ");
				try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
					log.info(" ---end-- ", e);
				}
			}
		}
	}
	
	public synchronized static long addTime(long time) {
		allResponsetime = allResponsetime + time;
		return allResponsetime;
	}
}
