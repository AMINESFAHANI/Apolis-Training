package com.apolis.main;

import java.util.Scanner;

public class FirstNonRepeatedChar {
    
	static String input;
	static char[] inputArray ; 
	
	public static void main(String[] args) {
		
		System.out.println("------------------------------------------------------------------");
		System.out.println("please enter a text : ");
		Scanner in = new Scanner(System.in);
		input = in.nextLine();
		inputArray = input.toCharArray();
		
		for (char x :inputArray) {
			if (input.indexOf(x) == input.lastIndexOf(x)) {
				System.out.println(x);
				break;
			}
		}

	}

}
