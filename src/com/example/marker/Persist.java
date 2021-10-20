package com.example.marker;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Persist {
	
	public static void main(String[] args) {
		//create a student object
		Student s = new Student(1,"Prabhu");
		// child classes are also serialziable
		Student1 s1 = new Student1(2,"siva");
		// not serializable exception will be thrown when reference are not serialized
		//Student2 s = new Student2(1,"Prabhu");
		
		//Creating fileinput stream for writing the object into a file
		try {
			FileOutputStream fileOutputStream = new FileOutputStream("G:\\temp\\new.txt");
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(s);
			
			fileOutputStream.close();
			
			System.out.println("success");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
