package com.apolis.main;
import java.util.HashMap;
import java.util.function.Function;

public class Functional {

	public static void main(String[] args) {
		
		Function<String,Integer> f =( s)->s.length();
		System.out.println(f.apply("amin esfahani"));

	}

}
