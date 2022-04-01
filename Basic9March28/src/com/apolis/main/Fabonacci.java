package com.apolis.main;

import java.util.*;

public class Fabonacci {

	public static void main(String[] args) {
	   
        System.out.println("Please enter a number : ");
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
	    System.out.println(fabonacci(n));
	}

	private static int fabonacci(int n) {
		
		int a=0,c=0,b=1;
		for(int i=2 ; i<n+1;i++) {
		    c=a+b;
		    a=b;
		    b=c;
		}
		return b;
	}

}
