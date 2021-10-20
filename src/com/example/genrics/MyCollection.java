package com.example.genrics;

import java.util.Iterator;

public class MyCollection<E> implements Iterable<E> {

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return new MyIterator<E>();
	}

	
}
