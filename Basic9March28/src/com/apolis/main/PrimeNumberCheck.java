package com.apolis.main;

import java.util.Scanner;

public class PrimeNumberCheck {

	public static void main(String[] args) {
		
		System.out.println("Please enter a number : ");
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
	    System.out.println(primeCheck(n));

	}

	private static boolean primeCheck(int n) {
		
		for(int i=2;i<n;i++) {
			if(n%i==0) return false;
		}
		return true;
	}

}
