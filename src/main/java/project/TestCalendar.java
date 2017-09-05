package project;

import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

import utils.DateUtils;


public class TestCalendar {
	@Test
	public void testCalendar(){
		Calendar calendar = Calendar.getInstance();
		Date date = DateUtils.getDate();
		date = DateUtils.addDay(date, 1);
		calendar.setTime(date);
		calendar.set(Calendar.HOUR_OF_DAY, 10);
		System.out.println(calendar);
	};
}
