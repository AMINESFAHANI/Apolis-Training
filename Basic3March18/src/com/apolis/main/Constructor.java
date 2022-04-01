/**
 * 
 */
package com.apolis.main;

/**
 Implementation of constructor 
 *
 Init Block
 
 *
Constructor Chaining within a class 


 */
public class Constructor {

	int wage;
	String fullName;
	
	{
		System.out.println("An object just created");
		this.fullName="James";
	}
	

	public Constructor() {
		// TODO Auto-generated constructor stub
	  
	}
	
	public Constructor(int wage,String name) {
		// TODO Auto-generated constructor stub
		this.wage=wage;
		fullName=name;
	}
	
	public Constructor(String fullName) {
		// TODO Auto-generated constructor stub
		this(7000,fullName);
		this.fullName=fullName;
	    
	}
	
	public static void main(String[] args) {
		Constructor test1 = new Constructor(1000,"John");
        System.out.println(test1.fullName);
        System.out.println(test1.wage);
        
        Constructor test2 = new Constructor("Jimmy");
        System.out.println(test2.fullName);
        System.out.println(test2.wage);
        
        Constructor test3 = new Constructor();
        System.out.println(test3.fullName);
        System.out.println(test3.wage);
	}

}
