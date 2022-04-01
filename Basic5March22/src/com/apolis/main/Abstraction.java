
// How to define an Abstract class
// Why constructor is allowed inside the an Abstract class.

package com.apolis.main;

abstract class Base1{
	
	int x ;
	int y ;
	static String s;
	
	Base1(int x, int y,String name){
		
		this.x=x;
		this.y=y;
		s=name;
	}

	abstract void show() ;

    void display() {
	
	System.out.println("display method in Base class");
}

    void baseMthod() {
    	
	System.out.println("baseMthod method in Base class");
}
}

class Child1 extends Base1{

	String name;
	int age;
	
	Child1(int x, int y, String name,int age) {
		super(x, y, name);
		this.age=age;
		this.name=name;
	}
	
	void printProperties(){
		System.out.println(x);
		System.out.println(y);
		System.out.println(s);
		System.out.println(name);
		System.out.println(age);	
	} 


	public void show(){
    System.out.println("Show method in Child class");
    super.display();
    super.baseMthod();
}
	
    void display() {
    
    super.display(); 	
	System.out.println("display method in Child class");
}
	
}
public class Abstraction {

	public static void main(String[] args) {
		
		Base1 obj3 = new Child1(10,20,"Ali",2);
        obj3.display();
        obj3.show();
        obj3.baseMthod();
		
	}
		

	}


