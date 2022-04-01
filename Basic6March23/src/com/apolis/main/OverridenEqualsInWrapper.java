

// All the wrapper classes override the equals method and we don't need to override them.


package com.apolis.main;

public class OverridenEqualsInWrapper {

	
	    
	    public static void main(String[] args) {
	        
	        String s1 = new String("Hello");
	        String s2 = new String("Hello");
	        Integer i1 = new Integer(10);
	        Integer i2 = new Integer(10);
	    /*    if(s1==s2)
	            System.out.println("true");
	        else
	            System.out.println("false");
	    }
	    false
	    */
	        
	        if(s1.equals(s2))
	            System.out.println("true");
	        else
	            System.out.println("false");
	    
	        if(s1==s2)
	            System.out.println("true");
	        else
	            System.out.println("false");
	        
	        if(i1==i2)
	            System.out.println("true");
	        else
	            System.out.println("false");
	        
	        if(i1.equals(i2))
	            System.out.println("true");
	        else
	            System.out.println("false");
	    }

	}

