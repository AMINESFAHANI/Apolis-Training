// Searching in an array by binary search method
package com.apolis.main;

import java.util.Arrays;
import java.util.Scanner;


public class ArrayBinarySearch {
	Integer arr[] =  {3,5,8,3,88,9,-49};
	int i;
	
	
    public static void main(String[] args) {
    	ArrayBinarySearch arr1 = new ArrayBinarySearch();
    	Scanner in = new Scanner(System.in);
    	arr1.i=in.nextInt();
    	in.close();
    	System.out.println(Arrays.toString(arr1.arr));
    
    	if (!Arrays.asList(arr1.arr).contains(arr1.i)) { System.out.println("There is no match");}
    	else {	Arrays.sort(arr1.arr);
    	       System.out.println( Arrays.toString(arr1.arr));
    		System.out.println(Arrays.binarySearch(arr1.arr, arr1.i));}
	
}
}
