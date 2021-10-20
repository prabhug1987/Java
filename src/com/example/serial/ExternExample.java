package com.example.serial;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class ExternExample {

	public static void main(String[] args) {
		Car car = new Car("Prabhu", 1987);
		Car newCar = null;

		// Serialize the car
		try {
			OutputStream outputStream = new FileOutputStream("C://one.txt");
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

			objectOutputStream.writeObject(car);
			objectOutputStream.flush();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}

		try {
			FileInputStream fileInputStream = new FileInputStream("C://one.txt");

			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
			newCar = (Car) objectInputStream.readObject();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}

		System.out.println("The original car is:\n" + car);
		System.out.println("The new car is:\n" + newCar);
	}

}
