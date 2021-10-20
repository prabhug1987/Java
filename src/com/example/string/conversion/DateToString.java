package com.example.string.conversion;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateToString {

	public static void main(String[] args) {
		Date date = Calendar.getInstance().getTime();
		DateFormat df = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
		String strDate = df.format(date);
		
		
		date = new Date();  
	    SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");  
	    strDate = formatter.format(date);  
	    System.out.println("Date Format with MM/dd/yyyy : "+strDate);  
	  
	    formatter = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");  
	    strDate = formatter.format(date);  
	    System.out.println("Date Format with dd-M-yyyy hh:mm:ss : "+strDate);  
	  
	    formatter = new SimpleDateFormat("dd MMMM yyyy");  
	    strDate = formatter.format(date);  
	    System.out.println("Date Format with dd MMMM yyyy : "+strDate);  
	  
	    formatter = new SimpleDateFormat("dd MMMM yyyy zzzz");  
	    strDate = formatter.format(date);  
	    System.out.println("Date Format with dd MMMM yyyy zzzz : "+strDate);  
	  
	    formatter = new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss z");  
	    strDate = formatter.format(date);  
	    System.out.println("Date Format with E, dd MMM yyyy HH:mm:ss z : "+strDate);  
	}
}
