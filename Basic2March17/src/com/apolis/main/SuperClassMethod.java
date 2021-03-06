
// Access super class method in case of method overriding 

package com.apolis.main;



class A1 {
    void method() {
        System.out.println(" Class A1 method()");
    }
}

class A2 extends A1{
    void method() {
        System.out.println("Class A2 method()");
    }
    void accessA1Method() {
        super.method();
    }
}

class A3 extends A2 {
    void method() {
        System.out.println("Class A3 method()");
    }
    void accessA2Method() {
        super.method();
    }
}

public class SuperClassMethod  {
    public static void main(String[] args) {
        A3 a3 = new A3();
        a3.accessA1Method();
        a3.accessA2Method();
        a3.method();
    }
}
