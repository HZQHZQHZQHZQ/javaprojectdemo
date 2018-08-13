package com.chu.demo.test5;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test2 {

	public static void main(String[] args) {
		
		System.err.println(dateToStr(new Date()));
		
	}
	

	public static String dateToStr(Date date){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
		String	str = sdf.format(date);
		return str;
	}
	
}
