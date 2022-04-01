
// static nested class 


package com.apolis.main;

public class Outer {
	
	
	static int x=10;
	static {
		x=90;
	}
	
	
	static class StaticInner{
	    static void show()
	{
	System.out.println("Static nested class : show()");
	}

	}
	public static void main(String[] a)
	{
	 Outer.StaticInner.show();
	 System.out.println(Outer.x);
	 System.out.println();
	 StaticInner.show();
	Outer.StaticInner inner = new Outer.StaticInner();
	//inner.show(); Not allowed
	
	}
	}



