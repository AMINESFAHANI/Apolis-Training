package com.apolis.main;

public class MovieBooking {

    public static void main(String[] args) throws InterruptedException {
        TotalEarning earning = new TotalEarning();
        TotalEarning earning1 = new TotalEarning();
        earning.start();
        earning1.start();
        earning.join();
        earning1.join();

//        synchronized (earning) {
          //  earning.wait();
           
            System.out.println("total earnings are : " + earning.totalIncome);
            
//           earning.notify();
//        }
//        synchronized (earning1) {
           
          //  earning1.wait();
            System.out.println("total earnings are : " + earning1.totalIncome);
            
//            earning1.notify();
        }
    }


