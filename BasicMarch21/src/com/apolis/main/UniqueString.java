package com.apolis.main;

import java.util.Scanner;



public class UniqueString {

	   
		static String input;
		static char[] inputArray ; 
		static boolean check = true;
		
		public static void main(String[] args) {
			
			System.out.println("------------------------------------------------------------------");
			System.out.println("please enter a text : ");
			Scanner in = new Scanner(System.in);
			input = in.nextLine();
			inputArray = input.toCharArray();
			
			for (char x :inputArray) {
				if (input.indexOf(x) != input.lastIndexOf(x)) {
					System.out.println(x+" "+"is one of the ununique character in tetx");
					check = false;
					break;
				}
			}
			
			if(check != false) {System.out.println("The imported text is unique ");}

		}			
}