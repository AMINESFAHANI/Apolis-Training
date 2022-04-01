package com.apolis.main;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int resualt=1;
		for (int i=1;i<n+1;i++)
			resualt*=i;
        System.out.println(resualt);
	}

}
