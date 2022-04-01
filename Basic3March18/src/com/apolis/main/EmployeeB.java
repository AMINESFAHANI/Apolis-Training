
// Call by value and call reference 

package com.apolis.main;

public class EmployeeB {
		private String  ename;
		private String age;
		private int salary;

		void setEmployeeData(String ename,String age,int salary)
		{
		this.ename=ename;
		this.age= age;
		this.salary=salary;
		}

		void setEmployeeData(EmployeeB employee)
		{
		this.ename=employee.ename;
		this.age= employee.age;
		this.salary=employee.salary;
		}
        
	    public EmployeeB(){};
		
		public EmployeeB(EmployeeB employee)
		{
		System.out.println("This constructor is using an object as an argument");
		this.ename=employee.ename;
		this.age= employee.age;
		this.salary=employee.salary;
		}


		public void display()
		{
		System.out.println(ename);
		System.out.println(age);
		System.out.println(salary);
		}
		public static void main(String[] a)
		{
		
		EmployeeB employee1 = new EmployeeB(); //1000
		employee1.setEmployeeData("Tom","25",2555);  // call by value
		employee1.display();
		
		EmployeeB employee2 = new EmployeeB();
		employee2.setEmployeeData(employee1);  
		employee2.display();
        
		EmployeeB employee3 = new EmployeeB(employee1);
		employee3.display();
		}
		}

