package com.apolis.main;

public class TotalEarning extends Thread {
    public int totalIncome = 0;

    @Override
    public void run()
    {
        synchronized(this){
        try {
			this.wait();
			for(int i=1;i<=10;i++)
	        {
	            totalIncome= totalIncome + 100;
	            
	        }
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        this.notify();
        }
    }

}

