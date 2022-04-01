//Data Shadowing implementation 2:

package com.apolis.main;

public class EmployeeD {
	private static String cname;
	private String ename;
	private int salary;
	
	public static void changeCname(String cname) {
		EmployeeD.cname=cname;
		
	}
    public void change(int salary, String ename) {
		this.ename=ename;
		this.salary=salary;
	    
    }
   public void printEmployeeData() {
	    System.out.println(ename);
	    System.out.println(salary);
	    System.out.println(cname);
}
   public static void main(String[] args ) {
	   changeCname("Apolis");
	   EmployeeD employee1= new EmployeeD();
	   employee1.change(100, "John");
	   employee1.printEmployeeData();
	

}
   
}
