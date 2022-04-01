package com.apolis.main;

public class MissingElement {
	
	
	public static int missingNumber(int [] array) {
		
		int n= array.length;
		int sum =0;
		for (int i=0;i<n;i++) {
			sum+=array[i];
		}
		return (n+1)*(n+2)/2-sum;
	} 

	public static void main(String[] args) {
		 
		int[] array = {1,3,4,5,6};
		System.out.println(missingNumber(array));
		
		}

}
