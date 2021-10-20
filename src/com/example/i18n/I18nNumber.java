package com.example.i18n;

import java.text.NumberFormat;
import java.util.Locale;

public class I18nNumber {
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		printNumber(Locale.UK);  
	    printNumber(Locale.US);  
	    printNumber(Locale.FRANCE);  
	    printNumber(Locale.JAPAN);  
	}
	
	static void printNumber(Locale locale){
		double dbl = 1050000.3245;
		NumberFormat formatter = NumberFormat.getNumberInstance(locale);
		String number = formatter.format(dbl);
		System.out.println(number +"for the locale "+ locale);
		
	}

}
