


//Method Hiding 

package com.apolis.main;


class Parent1{
    static void method() {
       System.out.println("Base Class method()");
   }
}

class Child1 extends Parent1{
       static void method() {
           System.out.println("Child Class method()");
       }
}

public class MethodHiding{
    public static void main(String[] args) {
        Parent1.method();
        Child1.method();
    }
}




