package test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class DeleteFile {
	public static void main(String[] args) throws IOException {
		File xmlDir = new File("D:\\gitSpace\\_task\\src\\main\\resources\\mapper");
		File javaDir = new File("D:\\gitSpace\\_task\\src\\main\\java\\com\\api\\mapper");
		File destDir = new File("D:\\temp");
		
		File[] xmlFiles = xmlDir.listFiles();
		File[] javaFiles = javaDir.listFiles();
		for(File xmlFile : xmlFiles){
			String xmlMapper = (xmlFile.getName().split("\\."))[0];
			for(File javaFile : javaFiles){
				String javaMapper = (javaFile.getName().split("\\."))[0];
				if(xmlMapper.equals(javaMapper)){
//					System.out.println(xmlFile);
//					FileUtils.copyFileToDirectory(xmlFile, destDir);
					xmlFile.delete();
				}
			}
		}
		
		
	}
}
