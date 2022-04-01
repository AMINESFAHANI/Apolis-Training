package com.apolis.main;

public class DeadLock {

	static int x =0;  
	
	public static void main(String[] args) {
		
		
		Thread t1 =new Thread(new Runnable() {
			
			@Override
			public void run() {
				while(x<10) continue;
				System.out.println("Thread1 is running");
				
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
			    
				while (x<10) x++;
				System.out.println("Thread2  is running");	
				
			}
		});
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       t2.start();
	}

}
