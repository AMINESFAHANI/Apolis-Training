package com.apolis.main;

import java.util.Arrays;

public class OddEvenSepration {

	public static void main(String[] args) {
		
		int[] array ={7,8,5,6,3,9,0,6,5,3,6,88};
		System.out.println(Arrays.toString(oddEvanSepration(array)));
	}

	private static int[] oddEvanSepration(int[] array) {
		
		int l=0;
		int r=array.length-1;
		while(l<r) {
			while(array[l]%2!=0) {
				l++;
			}
		    while(array[r]%2==0) {
			r--;
		    }
		if(l<r) {
			int temp=array[l];
			array[l]=array[r];
			array[r]=temp;
		}
	  }
		
		return array;
	}
}
