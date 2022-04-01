package com.apolis.main;

public class Immutable {
	
	private final String name;

	private Immutable(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
