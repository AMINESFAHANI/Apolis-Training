

// How to find duplicate characters in a string.


package com.apolis.main;

import java.util.ArrayList;
import java.util.Scanner;

public class Duplicatecharacters {

	
	 
		static String input;
		static char[] inputArray ;
		static ArrayList<Character> duplicateArray ;
		
		public static void main(String[] args) {
			
			System.out.println("------------------------------------------------------------------");
			System.out.println("please enter a text : ");
			Scanner in = new Scanner(System.in);
			input = in.nextLine();
			in.close();
			inputArray = input.toCharArray();
			duplicateArray = new ArrayList<Character>();
			
			for (char x :inputArray) {
				if ( input.indexOf(x) != input.lastIndexOf(x) & !duplicateArray.contains(x) ) {
					duplicateArray.add(x);
				}
			}

			System.out.println(duplicateArray.toString());
		
		}
}
