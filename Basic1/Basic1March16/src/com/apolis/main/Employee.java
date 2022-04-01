package com.apolis.main;

// Static Instance Data Members 


public class Employee {

	private static String cname="HCL";
	private String ename;
	private int salary;
	
	
	
	public static void main(String[] args) {
		
		System.out.println(cname);
		Employee employee1 = new Employee();
		Employee employee2 = new Employee();
		employee1.ename="John";
		employee2.salary=5000;
		System.out.println(employee1.ename);
		System.out.println(employee1.salary);
		System.out.println(employee2.ename);
		System.out.println(employee2.salary);
		
		
		

	}

}
