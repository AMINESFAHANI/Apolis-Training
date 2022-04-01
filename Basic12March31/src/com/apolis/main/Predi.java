package com.apolis.main;

import java.util.function.Predicate;

////Write examples for implementing and(),or(),negate()
//number must be greater then 5 and must be even.


public class Predi {

	public static void main(String[] args) {
		
		Predicate<Integer> isGreaterThan5 = x -> x>5;  
		Predicate<Integer> isEven = x -> x%2==0;
		Predicate<Integer> isOdd = x -> x%2!=0;  
		System.out.println(isEven.test(8));
		System.out.println(isEven.and(isGreaterThan5).test(5));
		System.out.println(isEven.or(isGreaterThan5).negate().test(2));
	}
}
