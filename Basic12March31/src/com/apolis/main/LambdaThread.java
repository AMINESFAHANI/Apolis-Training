package com.apolis.main;

public class LambdaThread {
	
	public static void main(String[] a) {
		Runnable r1 = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Thread with r1 is running");
				
			}
		};
	Thread t1 = new Thread(r1,"t1");
	
	Runnable r2 = () -> System.out.println("Thread with r2 is running");
	Thread t2 = new Thread(r2,"t2");
	
	t1.start();
	t2.start();
	}

}
