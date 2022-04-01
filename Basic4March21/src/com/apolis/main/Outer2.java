package com.apolis.main;

public class Outer2 {
	    int x=9;

		static class StaticInner{
            
		    static void show()
		{
		System.out.println("static method: Inner class");
		}
		void display()
		{
		System.out.println("Instance method: Inner class");

		}
		}
		public static void main(String[] a)
		{
		 StaticInner.show();
		 Outer2.StaticInner.show();
		 Outer2.StaticInner inner = new Outer2.StaticInner();
		 //inner.x;// it is not allowed
		
		 
		 
		}
		}



