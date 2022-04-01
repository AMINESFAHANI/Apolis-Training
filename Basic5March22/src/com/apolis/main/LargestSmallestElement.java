
// Finding smallest and largest element in an array .

package com.apolis.main;

public class LargestSmallestElement {

	static int[] array; 
	
	
	public static void main(String[] args) {
		
		array= new int[]{4,55,-9,22,45,6};
		int smallest=array[0],largest=array[0];
		for (int x :array) {
			
			if(x>largest) largest=x;
			if(x<smallest) smallest=x;
		}
		
        System.out.println("The smallest element is : "+smallest);
        System.out.println("The smallest element is : "+largest);
	}

}
