package project.effective;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

public class Constructer {
	@Test
	public void testInstatnce(){
		int[] arr = {1,2};
		List<int[]> asList = Arrays.asList(arr);
		System.out.println(Arrays.toString(arr));
		
		String[] s = {"aa","bb","cc"};
        List<String> strlist = Arrays.asList(s);
        System.out.println(strlist);
        
        List<String> list = new ArrayList<String>();
        
        for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			
		}
        
        new IllegalStateException();
        
//        new AbstractSequentialList();
        
//        list.add("9");
        String[] strs = new String[0];
        String[] array = list.toArray(strs);
        System.out.println(array.length);
        
        List emptyList = Collections.EMPTY_LIST;
        
		this.min(0, arr);
	}
	
	public static int min(int... args) {
		
		
		
		return 0;
		
	}
	public static int min(int first, int... args) {
		
		
		
		return 0;
		
	}
}
