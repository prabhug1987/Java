package com.example.marker;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class EmployeeDepersist {
	
	public static void main(String[] args) {
		try {
			// open the file in object out put streamfor deserialization
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("G:\\temp\\new.txt"));
			// reade the student object from the file
			Employee s = (Employee) in.readObject();
			
			System.out.println(s.getId() +  " "+ s.getName() );
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
