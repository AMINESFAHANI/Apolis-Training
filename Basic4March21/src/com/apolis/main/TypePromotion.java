package com.apolis.main;

/**
 * Type Promotion
 *
 */

public class TypePromotion {
	
		void show(short b){
		System.out.println ("show method: short type");
		}
		void show(int b){
		System.out.println ("show method: int type");
		}
		void show(long b){
		System.out.println ("show method: long type");
		}
		void show(float b){
		System.out.println ("show method: float type");
		}

		
		public static void main(String[] a){
		TypePromotion abc = new TypePromotion();
		abc.show((byte)10);
		abc.show((long)10.0);
		}
		}



