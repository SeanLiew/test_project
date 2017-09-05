package project;

import java.io.FileInputStream;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

public class TestExcelReader {
	@Test
	public void read(){
	try {
		InputStream is = new FileInputStream("F://散标.xlsx");

        XSSFWorkbook wb = new XSSFWorkbook(is);
		//3.得到Excel工作表对象  
        Sheet sheet = wb.getSheetAt(0);  
        //总行数  
        int trLength = sheet.getLastRowNum();  
        //4.得到Excel工作表的行  
        Row row = sheet.getRow(0);  
        //总列数  
        int tdLength = row.getLastCellNum();  
        //5.得到Excel工作表指定行的单元格  
        Cell cell = row.getCell((short)1);  
        //6.得到单元格样式  
        CellStyle cellStyle = cell.getCellStyle(); 
        for(int i=5;i<trLength;i++){  
            //得到Excel工作表的行  
            Row row1 = sheet.getRow(i);  
            for(int j=0;j<tdLength;j++){  
            //得到Excel工作表指定行的单元格  
            Cell cell1 = row1.getCell(j);  
            /** 
             * 为了处理：Excel异常Cannot get a text value from a numeric cell 
             * 将所有列中的内容都设置成String类型格式 
             */  
            if(cell1!=null){  
                  cell1.setCellType(Cell.CELL_TYPE_STRING);  
             }  
              
            if(j==5&&i<=10){  
                cell1.setCellValue("1000");  
            }  
              
            //获得每一列中的值  
            System.out.print(cell1+"                   ");  
            }  
            System.out.println();  
        }  
		
		} catch (Exception e) {
			System.out.println("失败"+e.getMessage());
		}  
	}
}
