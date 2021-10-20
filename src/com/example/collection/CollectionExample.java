package com.example.collection;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Formatter;
import java.util.Hashtable;
import java.util.IdentityHashMap;
import java.util.WeakHashMap;

public class CollectionExample {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();  
		
		BitSet bitSet = new BitSet();
		System.out.println(bitSet.cardinality());
		//System.out.println(bitSet.and(bitSet));
		
		Formatter formatter = new Formatter();
		
		Hashtable<String, String> hashTable = new Hashtable<>();
		
		IdentityHashMap<String, String> indentHashMap = new IdentityHashMap<>();
		
		WeakHashMap<String, Integer> weakHashMap = new WeakHashMap<>();
		
		
	}
}
