// How to call a non static method inside an none static inner class 

package com.apolis.main;

public class Outer3 {
	
	
		static int x=10;
		int y =20;
		class Inner{
		    
			//static int z=20;static variable is not allowed
			void show()
		{
		
	    Outer3.x=88;			
		y=7;
		System.out.println(Outer3.x);
		System.out.println(x);
		System.out.println(y);
		}
	        //static display() {}  static method is not allowed inside the non static inner class.		   

		}
		public static void main(String[] a)
		{
		Outer3 outer = new Outer3();
		Outer3.Inner inner = outer.new Inner();
		inner.show();
		//inner.y;// it is not allowed
		System.out.println(outer.y+"  "+Outer3.x);
		
		
		}
		}


