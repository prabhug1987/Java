package com.example.i18n;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class I18nTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printTime(Locale.UK);  
		printTime(Locale.US);  
		printTime(Locale.FRANCE);  

	}

	static void printTime(Locale locale) {
		DateFormat dateFormat = DateFormat.getTimeInstance(DateFormat.DEFAULT,locale);
		Date currentDate = new Date();
		
		String time = dateFormat.format(currentDate);
		System.out.println(time + " in  locale "+ locale);
		
	}
}
