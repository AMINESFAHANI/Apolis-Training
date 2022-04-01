
// final variable cannot be change
//Static Block , blank final instance data member, blank final static data member 



package com.apolis.main;

public class EmployeeA {
	
	final static String COMPANYNAME;
	final String NAME;
    int salary;
    
    static {
    	COMPANYNAME="Ford";
    }
    
    public EmployeeA(String name) {
    	//COMPANYNAME=cName; it is not allowed
    	//EmployeeA.COMPANYNAME=cName;  it is not allowed
    	this.NAME=name;
    	salary=1000;
    }
    public void displayData() {
    	System.out.println(NAME);
    	System.out.println(salary);
    	System.out.println(COMPANYNAME);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        EmployeeA obj = new EmployeeA("Amin");
        //obj.NAME="Ali";  It is not allowed.
        obj.displayData();
        System.out.println(EmployeeA.COMPANYNAME);
	}

}
