package com.apolis.main;

// how does the instance of keyword works.

interface inter {
	public void show();
}


interface inter1  {
	public void show();
}

class Base {
	public void baseMethod() {
		System.out.println("Execution of baseMethod()");
	}
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Execution of show() in Base");
		
	}
}

public class Child extends Base{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child = new Child();
		Base bc = (Base)child;
		Base base = new Base();
		//Child cb = (Child) base;
		
		bc.baseMethod();
		bc.show();
	
	   
		
		
		System.out.println(bc instanceof Child); 
		//System.out.println(cb instanceof Base);
	}

	
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Execution of show() in Child");
		
	}

	public void childMethod() {
		System.out.println("Execution of childMethod()");
	}
}
