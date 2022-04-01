

// How to implement the equals method


package com.apolis.main;

import java.util.Objects;

public class EqualsImplementation {


	    private String name;
	    private int rollNo;

	    public EqualsImplementation(String name, int rollNo) {
	        super();
	        this.name = name;
	        this.rollNo = rollNo;
	    }

	    public boolean equals(EqualsImplementation obj) {
	        
	    	if (this == obj) {
				return true;
			}
			if (obj == null) {
				return false;
			}
			if (this.getClass() != obj.getClass()) {
				return false;}
	    	if (rollNo != obj.rollNo)
	            return false;
	        return true;
	    }
	    
	    @Override
		public int hashCode() {
			return Objects.hash(name, rollNo);
		}


		public static void main(String[] args) {
	        
	        EqualsImplementation demo1 = new EqualsImplementation("John",21);
	        EqualsImplementation demo2 = new EqualsImplementation("Tom",33);
	        EqualsImplementation demo3 = new EqualsImplementation("Jim",21);
	        
	        
	        if(demo1.equals(demo3))
	            System.out.println(true);
	        else 
	            System.out.println(false);
	        
	        if(demo1==demo2)
	            System.out.println(true);
	        else 
	            System.out.println(false);
	    }

	}

