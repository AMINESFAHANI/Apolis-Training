// Implementation of static and non static methods

package com.apolis.main;

public class EmployeeB {
	private static String cname;
	private String ename;
	private int salary;
	
	public static void changeCname(String cname) {
		EmployeeB.cname=cname;
	}
    public void change(int Sal, String ename) {
		this.ename=ename;
		salary=Sal;
	    
    }
   public void printEmployeeData() {
	    System.out.println(ename);
	    System.out.println(salary);
	    System.out.println(cname);
}
   public static void main(String[] args ) {
	   changeCname("Apolis");
	   EmployeeB employee1= new EmployeeB();
	   employee1.change(100, "John");
	   employee1.printEmployeeData();
	
}

}

