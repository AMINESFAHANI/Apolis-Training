package com.apolis.main;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String digits= Integer.toString(n);
		int sumOfCubs=0;
		for (int i=0;i<digits.length();i++)
			sumOfCubs += Math.pow(Integer.valueOf(digits.substring(i, i+1)), 3);
		System.out.println(n==sumOfCubs);

	}

}
