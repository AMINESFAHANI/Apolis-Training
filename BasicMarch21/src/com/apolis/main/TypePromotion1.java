package com.apolis.main;

public class TypePromotion1 {
	

	

		void show(int a,long b){
		System.out.println ("show method: int,long type");
		}

		void show(long b,int a){
		System.out.println ("show method: long,int type");
		}

		public static void main(String[] a){
		TypePromotion1 abc = new TypePromotion1();
		abc.show(10,(long)10);
		abc.show((long)10,10);
		}
		}

