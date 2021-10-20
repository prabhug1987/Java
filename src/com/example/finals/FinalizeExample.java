package com.example.finals;

import java.lang.management.ManagementFactory;

public class FinalizeExample {
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		
		try {
			System.out.println("finalize of sub class");
		}catch (Exception e) {
			// TODO: handle exception
			throw e;
		}
		finally {
			System.out.println("Calling finalize of super class");
			super.finalize();
		}
		
		
	}
	
	public static void main(String[] args) {
		FinalizeExample finalizeExample = new FinalizeExample();
		FinalizeExample finalizeExample1 = new FinalizeExample();
		
		// making the references null
		finalizeExample = null;
		finalizeExample1 = null;
		
		System.gc();
		
		// calling finize method will work like normal method
		try {
			finalizeExample.finalize();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// calling run finalization method in system class
		System.runFinalization();
		
		//calling run finalization method runtime class
		Runtime.getRuntime().runFinalization();
		
		System.out.println(ManagementFactory.getRuntimeMXBean().getName());
	}

}
