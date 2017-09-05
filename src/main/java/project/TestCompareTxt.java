package project;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import org.junit.Test;

public class TestCompareTxt {
	@Test
	public void compare() throws Exception{
        File fileZ=new File("F://temp//13互联网.txt");
        InputStreamReader readZ = new InputStreamReader( new FileInputStream(fileZ));
        BufferedReader bufferedReaderZ = new BufferedReader(readZ);
        String lineTxtZ = null;
        String lineTxtQ = null;
        int i = 0;
        while((lineTxtZ = bufferedReaderZ.readLine()) != null){
        	boolean isFind = false;
        	BufferedReader bufferedReaderQ = new BufferedReader(new InputStreamReader( new FileInputStream(new File("F://temp//13detail0000.txt"))));
            while((lineTxtQ = bufferedReaderQ.readLine()) != null){
                if(lineTxtZ.equals(lineTxtQ)){
                	isFind = true;
                	break;
                }
            }
            if(!isFind){
            	System.out.println(lineTxtZ);
            }
            bufferedReaderQ.close();
        }
        bufferedReaderZ.close();
        System.out.println("end");
	}
}
