package project;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class TestTime {
	int i;
	static Map<String, Object> map = new HashMap<String, Object>();
	@Test
	public void test(){
//		String time = "2016-11-03";
//		long timeLong = DateUtil.parseLong(time);
//		System.out.println(timeLong);
//		String dateFormat = DateUtil.dateFormat(timeLong + 24*60*60);
//		System.out.println(dateFormat);
//		float f = 1e-34f;
//		double d = 1e-34;
//		System.out.println(f);
//		System.out.println(d);
//		map.put(1L+"", true);
//		System.out.println(map.get(1L+""));
//		int i = 200;
//		long lng;
//		lng = i;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssss");
		Date now=new Date();
		System.out.println("EF" + sdf.format(now));
		//20170302172034
		//201703021721017
		//2017030217210041
		//2016082110272064
	}
}
