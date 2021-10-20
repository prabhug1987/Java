package com.example.string.conversion;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date2Timestamp {
	
	public static void main(String[] args) {
		Date date = new Date();
		Timestamp ts = new Timestamp(date.getTime());
		
		System.out.println(ts);
		
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(formatter.format(ts));
		// pass timestamp to date time in constructor
		ts = new Timestamp(System.currentTimeMillis());
		date = new Date(ts.getTime());
		System.out.println(date);
		
		ts = new Timestamp(System.currentTimeMillis());
		date = ts;
		
		System.out.println(date);
		
		
		
		
	}

}
