/**
 * 
 */
package com.apolis.main;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Finding any match in an int array by binary search method :
 *
 */
public class ArrayBinarySearch {
    int[] arr ;
    int key;
	
    public boolean binarySearch(int i,int j) {
    	
    	if (arr[(i+j)/2]==key) return true;
    	if (i>j) return false;
    	if (arr[(i+j)/2]>key)  return binarySearch(i,(i+j)/2-1);
    	if (arr[(i+j)/2]<key)  return binarySearch((i+j)/2+1,j);
    	return false;
	}
    
	
    public static void main(String[] args) {
		ArrayBinarySearch obj = new ArrayBinarySearch(); 
		Scanner in = new Scanner(System.in);
		obj.key=in.nextInt();
		in.close();
		obj.arr=new int[] {1,2,6,88,23,-34,3,0};
		int i=0,j=obj.arr.length-1;
		Arrays.sort(obj.arr);
		System.out.println(obj.binarySearch(i, j));
		

	}

}
