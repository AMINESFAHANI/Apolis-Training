package com.apolis.main;

import java.util.Objects;

public class Employee {
	
	int employeeId;
	double salary;
	String name;

	public Employee(int employeeId, String name, double salary) {
		super();
		this.employeeId = employeeId;
		this.salary = salary;
		this.name = name;
		
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(employeeId, name, salary);
	}

	@Override
	public boolean equals(Object obj) {
//		if (this == obj) {
//			return true;
//		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Employee other = (Employee) obj;
		return this.employeeId == other.employeeId ;
	}

	public static void main(String[] args) {
	   
		Employee employee1 = new Employee(1,"John", 3500.00);
		Employee employee2 = new Employee(1,"Jim", 3500.00);
		if(employee1==employee2) System.out.println("Equal1");
		if(employee1.equals(employee2)) System.out.println("Equal2");
	}

}
