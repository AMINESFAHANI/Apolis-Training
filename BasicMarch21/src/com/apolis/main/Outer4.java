// How to defin a local inner class

package com.apolis.main;

public class Outer4 {
	
	    int z=80;
		public void display()
		{
		    class LocalInner{
		        int x=9;
		    	
		    	void display()
		{
		System.out.println("local inner class");
		}
		}
		LocalInner inner = new LocalInner();
		inner.display();
		System.out.println(inner.x+z);
		}
		public static void main(String[] args){
		Outer4 outer  = new Outer4();
		outer.display();
		}
		}



