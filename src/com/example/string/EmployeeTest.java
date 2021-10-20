package com.example.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeTest {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(2, "My"));
		employees.add(new Employee(1, "Prabhu"));
		employees.add(new Employee(4, "Sundari"));
		employees.add(new Employee(3, "suganthan"));

		print(employees);

		Collections.sort(employees);

		print(employees);

		Comparator<Employee> nameComparator = new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			}
		};

	}

	private static void print(List<Employee> employees) {
		// TODO Auto-generated method stub
		System.out.println("------------------------------------------------");
		employees.forEach(employee -> System.out.println("Id " + employee.getId() + " Name : " + employee.getName()));
	}
}
