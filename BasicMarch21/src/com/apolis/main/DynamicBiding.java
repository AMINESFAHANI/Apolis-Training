// Dynamic Binding

package com.apolis.main;

public class DynamicBiding {

	
		public void method()
		{
		System.out.println("method: Base class");
		}
		}
class Child extends DynamicBiding{
		public void method()
		{
		System.out.println("method: Child class");
		}
}
class Main{		
public static void main(String[] s)
		{
		DynamicBiding base = new Child();
		base.method();
		}
		}

	

