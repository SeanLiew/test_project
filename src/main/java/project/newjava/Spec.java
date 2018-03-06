package project.newjava;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;

public class Spec {
	
	@Test
	public void testLambda() {
//		Arrays.asList( "a", "b", "d" ).forEach( e -> System.out.println( e ) );
		
		List<String> list = new ArrayList<>();
		list.add("Apple");
//		List<String> collect = list.stream().filter( str -> str.equals("Apple")).collect(Collectors.toList());
		
		System.out.println(list);
		
		Collections.sort(list);
		
	}
	
//	static List<String> filterStr(List<String> list, ){
//		
//	}
	@Test
	public void testFilter() {
		
//		File[] hiddenFiles = new File(".").listFiles(new FileFilter() {
//			@Override
//			public boolean accept(File file) {
//				return file.isHidden();
//			}
//			
//		});
//		
//		File[] hiddenFiles2 = new File(".").listFiles(File::isHidden);
//		
//		System.out.println(hiddenFiles);
//		System.out.println(hiddenFiles2);
		
		
	}
	
}
