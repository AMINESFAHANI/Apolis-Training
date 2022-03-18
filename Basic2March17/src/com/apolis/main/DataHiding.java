//Data Hiding 

package com.apolis.main;






   class B0{
        int x= 0;
}
	
	class B1 extends B0{
	    int x= 10;
	    void method() {
	    
	   System.out.println("Super base class variable : "+super.x); // data hiding 
	}
	}
	class B2 extends B1 {
	    int x = 20;
	    void method() {
	        int x = 30;
	        System.out.println("Local variable : "+x);
	        System.out.println("class level variable : "+this.x); // data shadowing
	        System.out.println("base class variable : "+super.x); // data hiding 
	        super.method();
	    }
	}

	public class DataHiding { 
	    public static void main(String[] args) {
	        //B1 b1 = new B1();
	        B2 b2 = new B2();
	        b2.method();
	    }
	}


