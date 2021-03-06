


/**
 *Method overriding by changing return types 
 */
package com.apolis.main;

class A{};

class B extends A{};

class Parent{
	 A method(){
		System.out.println(" Parent Method");
		return new B();
	}
}

class Child extends Parent{
	//The visibility of the child class methods should more than the parent class methods
	public B method() {
		System.out.println("Child Method");
		return new B();
	}
}


public class OverridingRetunType {

	public static void main(String[] args) {
		Child c = new Child();
		c.method();
		}
}
