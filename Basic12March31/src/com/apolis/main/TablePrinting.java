package com.apolis.main;

import java.util.Scanner;

public class TablePrinting {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int i=1;i<n+1;i++) {
			System.out.println(n+"*"+i+"="+n*i);
			
		}
	}

}
