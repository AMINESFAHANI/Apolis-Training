
// Static inner class can only have static methods and variables and can not access to the non static outer class methods and variables. 

package com.apolis.main;


public class Outer1 {

		static int x=10;
		int y =20;
		static class StaticInner{

		    static void show()
		{
		System.out.println(x);
		//sysout(y); //that is not allowed because y is not static.
		}

		}
		public static void main(String[] a)
		{
		 Outer.StaticInner.show();
		 StaticInner.show();
		 System.out.println(Outer.x);
		 Outer.StaticInner inner = new Outer.StaticInner();
		 Outer1 outer = new Outer1();
		 System.out.println(outer.y);
		}
		}
