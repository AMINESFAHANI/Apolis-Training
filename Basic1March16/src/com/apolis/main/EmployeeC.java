//Data Shadowing

package com.apolis.main;

public class EmployeeC {
	private int x=10;
	
    public void access(int x) {
	    x=20;
		System.out.println(this.x);
	}
    public static void main(String[] args) {
	    EmployeeC employee1 = new EmployeeC();
	    employee1.access(70);
	}
}
