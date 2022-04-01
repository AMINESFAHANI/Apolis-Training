package com.apolis.main;

import java.util.Scanner;

public class JavaExceptionExample{
	  
		  public static void main(String args[]){  
		  System.out.println("Enter any value");
		 
		  
		  try{
			  int y=6;
			  System.out.println("Execution of try block");
			  double  data=10/y;  
		      System.out.println(data);
		  }
		  
          catch(TypeNotPresentException e) {
			  
			  System.out.println(e.toString());
		      System.out.println("An exception rather than Arithmetic was caught.");
			  
		  }
		  
		  catch(ArithmeticException e) {
			  
			  System.out.println(e.toString());
		  
		  }
          catch(Exception e) {
			  
			  System.out.println(e.toString());
		  
		  }
         
		  finally {
		  
			  System.out.println("rest of the code...");  
		  }  
		} 

}

