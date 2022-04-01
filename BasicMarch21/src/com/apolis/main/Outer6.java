
// Define a local class inside an instance method of Outer class . 


package com.apolis.main;

public class Outer6 {
	

		int x=10;
		static int y=20;
		public void display()
		{
		    int z =8;
			
			class LocalInner{
		void display()
		{
		//z=30; Inside a local inner class we can not change the vars of the method in which it is defined.
			System.out.println(z);
		
			System.out.println(y); //will accessible 
		System.out.println(x); //will accessible 
		}
		}
		LocalInner inner = new LocalInner();
		inner.display();
		}
		public static void main(String[] args){
		Outer6 outer  = new Outer6();
		outer.display();
		}
		}

