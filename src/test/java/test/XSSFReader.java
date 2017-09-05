package test;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XSSFReader {
	public static void main(String[] args) throws Exception {
		XSSFWorkbook xwb = new XSSFWorkbook(new FileInputStream("F:\\d.xlsx"));
		XSSFSheet sheet = xwb.getSheetAt(0);
		XSSFRow row;
		String cell;
		for (int i = sheet.getFirstRowNum(); i < sheet.getPhysicalNumberOfRows(); i++) {
			row = sheet.getRow(i);
			for (int j = row.getFirstCellNum(); j < row.getPhysicalNumberOfCells(); j++) {
				// 通过 row.getCell(j).toString()获取单元格内容，
				cell = row.getCell(j).toString();
				System.out.print(cell + "\t");
			}
			System.out.println("");

		}
	}
}
