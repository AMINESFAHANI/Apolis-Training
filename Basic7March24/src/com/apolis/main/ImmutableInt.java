package com.apolis.main;

public class ImmutableInt {
	
		  private final int value;

		  public ImmutableInt(int i) {
		    value = i;
		  }

		  public int getValue() {
		    return value;
		  }
		}


class Main{
	public static void main(String[] a) {
		ImmutableInt obj = new ImmutableInt(9);
		//obj.value=0;
		System.out.println(obj.getValue());
	}
}