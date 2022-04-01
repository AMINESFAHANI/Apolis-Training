package com.apolis.main;


	import java.sql.SQLException;
	import java.util.Scanner;

	class Base10 {

	    public void method() {
	    	System.out.println("Base Method");
	    	//throw new SQLException();
	    	
	    	
	    }
	}

	public class OverridingExceptions  extends Base10 {
	    public void method() throws ArithmeticException{
	    	System.out.println("Child method");
	    	throw new ArithmeticException();
	    	
	    }

	    public static void main(String args[]) throws SQLException {
	        Base10 base = new OverridingExceptions();
	        base.method();
	        System.out.println("Rest of the code");
	    }
	}


