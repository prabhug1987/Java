package com.example.marker;

import java.io.Serializable;

public class Student implements Serializable {
	int id;
	String name;
	
	static String college = "Theni college";// this wont be serialized

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the college
	 */
	public static String getCollege() {
		return college;
	}

	/**
	 * @param college the college to set
	 */
	public static void setCollege(String college) {
		Student.college = college;
	}

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
}