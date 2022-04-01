package com.apolis.main;

	import java.util.HashMap;
	import java.util.Iterator;
	import java.util.Map;

	@FunctionalInterface
	interface Base {
	    void method();
	
	default void method1() {
		System.out.println("Implementation of method1");
	}
	}
	class Child implements Base {
	    public void method() {
	        System.out.println("implemention 1");
	    }
	}

	public class TestClass {
	    public static void main(String[] args) {
	        Base base = new Child();
	        base.method();
	        base.method1();

	        Base base2 = new Base() {
	            public void method() {
	                System.out.println("implemention 2");
	            }
	        };
	        base2.method();
	        base2.method1();
	        
	        Base base3 = () -> System.out.println("implemention 3");
	        base3.method();
	        base3.method1();
	    }
	}
	

