// Nested interface , 


package com.apolis.main;

interface CustomInterface4{
void show();

void display();

void intefaceMethod();

interface CustomInterface5{
void show();

void display();

void innerInterfaceMethod();
}
}


public class NesstedInterface implements CustomInterface4.CustomInterface5 {

	public static void main(String[] args) {
		
		CustomInterface4 obj = new NesstedInterface1();
		CustomInterface4.CustomInterface5 obj1 = new NesstedInterface(); 
		obj.display();
		obj.show();
		obj.intefaceMethod();
		obj1.display();
		obj1.display();
		obj1.innerInterfaceMethod();
		

	}

	@Override
	public void show() {
		
		System.out.println("implementation of InnerInterface in show method");
		
	}

	@Override
	public void display() {
		
		System.out.println("implementation of InnerInterface in display method");
		
	}

	

	@Override
	public void innerInterfaceMethod() {
		
		System.out.println("implementation of InnerInterface in innerMethod method");
		
	}

}

class NesstedInterface1 implements CustomInterface4{

	

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("implementation of Interface in show method");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("implementation of Interface in display method");
		
	}

	@Override
	public void intefaceMethod() {
		// TODO Auto-generated method stub
		System.out.println("implementation of InnerInterface in interfaceMethod method");
		
	}
}