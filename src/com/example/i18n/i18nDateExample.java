package com.example.i18n;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class i18nDateExample {

	public static void main(String[] args) {
		printDate(Locale.UK);
		printDate(Locale.US);
		printDate(Locale.FRANCE);
	}

	static void printDate(Locale locale) {
		DateFormat formatter = DateFormat.getDateInstance(DateFormat.DEFAULT, locale);
		Date currentDate = new Date();

		String date = formatter.format(currentDate);

		System.out.println(date + " " + locale);
	}
}
