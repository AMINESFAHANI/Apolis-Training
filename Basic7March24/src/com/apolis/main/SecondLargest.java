package com.apolis.main;

import java.util.Arrays;

public class SecondLargest {

	public static Object secondLargest(int[] array) {
		
		if (array.length<2) return null;
		else {
			int largest1=array[0];
			int largest2=array[1];
			int[] largests= {largest1,largest2};
			Arrays.sort(largests);
			for (int i=2;i<array.length;i++) {
				if (array[i]> largests[0]) {
					largests[0]=array[i];
					Arrays.sort(largests);
				}
					
			}
			 return largests[0];	
		}
	  
	}
		
	public static void main(String[] args) {
		
		int[] array = {1,2,3,4,5,3,7,6};
		System.out.println(secondLargest(array));

	}

}
