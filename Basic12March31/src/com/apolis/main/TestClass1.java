package com.apolis.main;

//Default method interview Question

interface Base1 {
    default void method() {
        System.out.println("Base1 : default method invoke");
    }
}

interface Base2 {
    default void method() {
        System.out.println("Base2 : default method invoke");
    }
}

class Child1 implements Base1,Base2 {
    public void method() {
        System.out.println("overridden method()");
        Base1.super.method();
        Base2.super.method();
    }
    
}

public class TestClass1 {
    public static void main(String[] args) {
        Base1 base = new Child1();
        base.method();
    }
}

