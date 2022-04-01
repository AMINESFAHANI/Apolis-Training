
// define a local class inside a static method in outer class.

package com.apolis.main;

import com.apolis.main.Outer3.Inner;

public class Outer5 {


		int x=10;
		static int y=20;
		public static void display()
		{
		    class LocalInner{
		void display()
		{
		System.out.println(y); //will accessible 
		System.out.println(Outer5.y); 
		//System.out.println(x); // It is not allowed to use non static var in a static method 
		}
		}
		LocalInner inner = new LocalInner();
		inner.display();
		}
		public static void main(String[] args){
		Outer5 outer  = new Outer5();
		//outer.display();will not accessible in non static way
		Outer5.display();
		System.out.println(outer.x);
		}
		}

