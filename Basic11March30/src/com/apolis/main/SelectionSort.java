package com.apolis.main;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		
		int[] array = {1,5,9,3,7,2,0,4};
		for(int i=0;i<array.length-1;i++) {
			for(int j=i;j<array.length;j++) {
				if(array[i]>array[j]) {
					int temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
       System.out.println(Arrays.toString(array));
	}

}
