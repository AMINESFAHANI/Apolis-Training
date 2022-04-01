package com.apolis.main;

class A{  
	  interface InnerInterface{  
	   void msg();  
	  }  
	}

	





public class InsideClassInterface implements A.InnerInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A.InnerInterface obj = new InsideClassInterface();
		obj.msg();

	}

	@Override
	public void msg() {
		System.out.println("Implementation of msg method");
		
	}

}
