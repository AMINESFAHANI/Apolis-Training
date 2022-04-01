package com.apolis.main;

public class ExceptionExample2 {

	
	    public static int method() {
	        try {
	            int data = 10 / 0;
	            System.out.println("try executed.");
	            return 10;
	        } catch (Exception e) {
	            System.out.println("catch executed.");
	            return 20;
	        } finally {
	            System.out.println("finally executed.");
	            return 30;
	        }
	        
	    }

	    public static void main(String args[]) {
	        int x = method();
	        System.out.println(x);
	    }
	}

