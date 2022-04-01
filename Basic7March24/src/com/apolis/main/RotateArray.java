package com.apolis.main;

import java.util.Arrays;

public class RotateArray {

	public static int[] rotate(int[] array) {
		
		int n = array.length;
		int temp = 0;
	    for (int i=0;i<n/2;i++) {
	    	temp=array[i];
	    	array[i]=array[n-i-1];
	    	array[n-i-1]=temp;
	    }
	    return array;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,2,3,4};
		System.out.println(Arrays.toString(rotate(array)));
    }

}
