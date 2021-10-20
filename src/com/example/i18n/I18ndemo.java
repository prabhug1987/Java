package com.example.i18n;

import java.util.Locale;
import java.util.ResourceBundle;

public class I18ndemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ResourceBundle bundle = ResourceBundle.getBundle("MessageBundle",Locale.US);
		System.out.println("Message in "+ Locale.US + " : "+bundle.getString("greeting"));;
		
		Locale.setDefault(new Locale("in","ID"));
		bundle = ResourceBundle.getBundle("MessageBundle");
		
		System.out.println("Message in "+ Locale.getDefault() + " : "+bundle.getString("greeting"));;
		

	}

}
