
// Implimentation of an interface using dynamic binding
// Implimetation of multiple interfaces by one class


package com.apolis.main;

class Base{

	void show() {
	
	System.out.println(" show method in Base class");
}

    void display() {
	
	System.out.println("display method in Base class");
}

    void baseMthod() {
    	
	System.out.println("baseMthod method in Base class");
}
}


interface CustomInterface1{
void show();

void display();
}

interface CustomInterface2{
void show();
}

class Child extends Base  implements CustomInterface1,CustomInterface2{

	public void show(){
    c
    super.show();
    super.baseMthod();
}

@Override
public void display() {
	System.out.println("implementation of interface in display method");
	super.display();
	
}
}




public class CustomInterface {

	public static void main(String[] args) {
		
		CustomInterface1 obj1 = new Child();
		obj1.show();
		obj1.display();
		
		CustomInterface2 obj2 = new Child();
		obj2.show();
		//obj2.display(); It is not allowed since obj2 is binding with CustomInterface2
		
        Base obj3 = new Child();
        obj3.display();
        obj3.show();
        obj3.baseMthod();
	}

}
