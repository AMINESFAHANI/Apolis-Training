
/*
 * Constructor Chaining out side the class 
 */


package com.apolis.main;

class Company{
    String companyName;
   Company(String cname){
       companyName = cname;
   }
}



public class Employee extends Company{

   String ename;
   int salary;
   // we can not override the constructors in child classes
   Employee(String ename){
       this(70000);
       this.ename=ename;
   }
   
   Employee(int salary){
       super("Hcl");// always must be at first line
       //this("Tom"); // more than one call constructor is not allowed because both should be at first line
       this.salary=salary;
   }
   
   public void displayData() {
       System.out.println("Employeee Name : "+ename);
       System.out.println("Employee Salary : "+salary);
       System.out.println("Employee Company : "+super.companyName);
   }
   public static void main(String[] args) {
       Employee employee2 = new Employee("Jim");
       employee2.displayData();
   }

}



