package com.example.i18n;

import java.util.Iterator;
import java.util.Locale;

public class LocalExample1 {
	
	public static void main(String[] args) {
		Locale local = Locale.getDefault();
		for(Locale l : Locale.getAvailableLocales()) {
			System.out.println("country "+l.getCountry());
			System.out.println("display country "+l.getDisplayCountry());
			System.out.println(" display language "+l.getDisplayLanguage());
			System.out.println(" display name "+ l.getDisplayName());
			System.out.println(" display script "+l.getDisplayScript());

			System.out.println("variant is "+l.getDisplayVariant());
			
			
		}
		System.out.println(Locale.getAvailableLocales());
		System.out.println(Locale.getISOCountries());
		System.out.println(Locale.getISOLanguages());
		Locale locale = new Locale("fr","FR");
		System.out.println(locale.getCountry());
		
		
	}

}
