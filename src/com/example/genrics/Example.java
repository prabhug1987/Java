package com.example.genrics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Example {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		//list.ensureCapacity(10);    // This will not work
		//List<String> list1 = new LinkedList<String>();
		
		getList();
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.ensureCapacity(10);    // This will work
	}

	public static List<String> getList() {
		List<String> tempList = new ArrayList<>();
		return tempList;
	}
	
	public void changeList(List<String> list) {
		
	}
}
