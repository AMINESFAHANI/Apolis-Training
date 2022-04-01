
// Selection Sort

package com.apolis.main;

import java.util.Arrays;

public class SelectionSort {
	
	static int[] array;
	
    public static int[] sort(int[] array) {
    	
    	
    	
    	for (int i = 0; i < array.length-1 ; i++  ) {
    		for (int j = i+1 ; j < array.length ; j++ ) {
    			if (array[i] > array[j]) {
    				
    				int temp = array[i];
    	    	    array[i]=array[j];
    	    	    array[j]= temp;
    			}
    		}
    	    
    		
    	    
    	}
    	
    	return array;
    }
	
	
	public static void main(String[] args) {
		
		array = new int[] {88,6,7,8,4,5,6,7,8};
		System.out.println(Arrays.toString(sort(array)));
		
    }

}
