
//Searching in an array
package com.apolis.main;


public class ArraySearchLinear1 {
	int[] arr = new int[5];
	int k=-1;
	
    
	public int searchInArray(int[] arr,int i) {
		for(int j=0;j<arr.length;j++) {
			if(arr[j]==i) {
				k=j;
				return k;
			}
			
		}return k;
		
	}
    public static void main(String[] args ) {
    	ArraySearchLinear1 arr1 = new ArraySearchLinear1();
    	arr1.arr[0]=9;
    	arr1.arr[1]=6;
    	arr1.arr[2]=99;
    	arr1.arr[3]=2;
    	arr1.arr[4]=7;
    	if( arr1.searchInArray(arr1.arr, 6)==-1) System.out.println("There is no match");
    	else {System.out.println("There is match in index : "+arr1.k);}
    	
    }   
}