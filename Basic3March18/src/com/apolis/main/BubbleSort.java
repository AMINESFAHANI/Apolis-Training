
// Bubble sort


package com.apolis.main;

import java.util.Arrays;

public class BubbleSort {
    int[] array;
    
	public int[] bubbleSort(int[] array) {
		int n =array.length;
		
		for (int i=n-1;i>0;i--) {
			for (int j=n-1;j>n-1-i;j--) {
				if(array[j]<array[j-1]) {
					int temp=array[j];
					array[j]=array[j-1];
					array[j-1]=temp;
				}
			}
		}
	

	return array ;
	}
    
    public static void main(String[] args) {
	    BubbleSort obj = new BubbleSort();	
    	obj.array= new int[] {2,55,7,8,3,4,5};
        System.out.println(Arrays.toString(obj.bubbleSort(obj.array)));
	}

}
