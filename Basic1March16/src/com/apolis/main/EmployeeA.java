//Istatic Method

package com.apolis.main;

public class EmployeeA {
	
	private static String cname ;
	
	
	public static void changeCname(String c) {
		cname=c;
	}
	 
    public static void main(String[] args ) {
		System.out.println(cname);
		changeCname("Apolis");
		System.out.println(cname);
	}
}
