package com.apolis.main;


//Copy constructor



class SuperClass{
void print(){
System.out.println("SuperClass class : print()");
}
}

class Base extends SuperClass{
void display(){
System.out.println("Base class : Display()");
}
}

public class CopyConstructor extends Base{
	

void show(){
System.out.println("Child  class : show()");
}
public static void main(String[] args){

CopyConstructor child = new CopyConstructor();
child.show();
child.display();
child.print();
}
}






