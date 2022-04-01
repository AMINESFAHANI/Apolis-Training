// In case of overloading always wrapper class has primery
// If we have more than one wrapper class compiller will be ambiguous.compile time error.

package com.apolis.main;

public class OverloadingQuestion {
	
	void method(Object obj)
	{
		System.out.println("Object type args");
	}
	void method(String s)
	{
		System.out.println("String type args");
	}
	void method(int i)
	{
		System.out.println("String type args");
	}
//	void method(Integer integer)    // The method method(Object) is ambiguous for the type OverloadingQuestion
//	{
//		System.out.println("String type args");
//	}
	
	public static void main(String[] a){
	OverloadingQuestion abc = new OverloadingQuestion();
	abc.method(null);
	}


}
