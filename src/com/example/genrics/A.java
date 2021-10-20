package com.example.genrics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class A {

	public static void main(String[] args) {
		List<A> lista = new ArrayList<A>();
		List<B> listb = new ArrayList<B>();
		List<C> listc = new ArrayList<C>();
		
		List<Object> listObjects = new ArrayList<Object>();
		//lista = listb;
		
		List<?> listUnknown = new ArrayList<A>();
		List<? extends A> listUnknown2 = new ArrayList<A>();
		List<? super A> listUnknown3 = new ArrayList<A>();
		
		processElements(lista);
		processElements(listb);
		processElements(listc);
		
		insertElements(listObjects);
		
		
	}
	
	public static void insertElements(List<? super A> list) {
		list.add(new A());
		list.add(new B());
		list.add(new C());
		
	}
	
	
	public static void processElements(List<? extends A> elements) {
		for(A a : elements) {
			System.out.println(a);
		}
    }
	private char[] getValue() {
		// TODO Auto-generated method stub
		return null;
	}
}

class B extends A{
	
}
class C extends A {
	
}
