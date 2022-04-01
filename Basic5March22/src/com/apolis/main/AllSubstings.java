
//Finding all the substrins in an exsisting string.


package com.apolis.main;

import java.util.Scanner;

public class AllSubstings {
    
	static String input;
	
	public static void main(String[] args) {
		
		System.out.println("------------------------------------------------------------------");
		System.out.println("please enter a text : ");
		Scanner in = new Scanner(System.in);
		input = in.nextLine();
		in.close();
		for(int i=0;i<input.length();i++) {
			for(int j=i+1;j<input.length()+1;j++) {
				System.out.println(input.substring(i, j));
			}	
				
		} 
		
	}

}
