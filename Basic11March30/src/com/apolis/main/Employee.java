package com.apolis.main;

import java.util.Set;
import java.util.TreeSet;

public class Employee {

	int salary;
	String name;
	
	
	public Employee(String name,int salary) {
		super();
		this.salary = salary;
		this.name = name;
	}


	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", name=" + name + "]";
	}

	public static void main(String[] args) {
		
		Employee employee1 = new Employee("Tom",3000);
		Employee employee2 = new Employee("John",3600);
		Employee employee3 = new Employee("Eric",3600);
		Employee employee4 = new Employee("Ali",3500);
        Set<Employee> staff = new TreeSet<>(new CustomComparator());
        staff.add(employee1);
        staff.add(employee2);
        staff.add(employee3);
        staff.add(employee4);
        System.out.println(staff);

	}
}
