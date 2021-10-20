package com.example.genrics;

public class GenricFactory<T> {
	
	Class theClass = null;
	
	public GenricFactory(Class theClass) {
		// TODO Auto-generated constructor stub
		this.theClass = theClass;
	}
	
	public T createInstance() throws IllegalAccessException, InstantiationException{
		return (T) this.theClass.newInstance();
	}

}
