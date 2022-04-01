package com.apolis.main;

public class ToStringImplementation {

	    int x =10;
	    int y = 20;
	    int z = 30;
	        
	    @Override
		public String toString() {
			return "ToStringImplementation [x=" + x + ", y=" + y + ", z=" + z + ", getClass()=" + getClass()
					+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
		}

	    public static void main(String[] args) {
	        
	        ToStringImplementation demo = new ToStringImplementation();
	        System.out.println(demo.toString());
	    }

	}


