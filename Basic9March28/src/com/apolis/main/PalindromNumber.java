package com.apolis.main;

import java.util.Scanner;

public class PalindromNumber {

	public static void main(String[] args) {
		
		System.out.println("Please enter a number : ");
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
	    System.out.println(palindromCheck(n));

	}

	private static boolean palindromCheck(int n) {
		
		String number = Integer.toString(n);
		for(int i=0;i<number.length();i++) {
			if(number.charAt(i)!=number.charAt(number.length()-i-1))return false;
		}
		return true;
	}
}


