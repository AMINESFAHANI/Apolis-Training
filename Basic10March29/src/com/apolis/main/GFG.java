package com.apolis.main;

//Java Program demonstrating Introduction to Java Executor
//Framework

//Importing concurrent classes from java.util package
import java.util.concurrent.*;


//Class 2
//Main Class
//ExecutorExample
public class GFG {

 // Main driver method
 public static void main(String[] args)
 {

     // Creating an object of above class
     // in the main() method
     Task task = new Task("GeeksForGeeks");
     Task task1 = new Task("GeeksForGeeks1");

     // Creating object of ExecutorService class and
     // Future object Class
     ExecutorService executorService
         = Executors.newFixedThreadPool(1);
     Future<String> result
         = executorService.submit(task);
     Future<String> result1
     = executorService.submit(task1);

     // Try block to check for exceptions
     try {
         System.out.println(result.get()+result1.get());
     }

     // Catch block to handle the exception
     catch (InterruptedException
            | ExecutionException e) {

         // Display message only
         System.out.println(
             "Error occurred while executing the submitted task");

         // Print the line number where exception occurred
         e.printStackTrace();
     }

     // Cleaning resource and shutting down JVM by
     // saving JVM state using shutdown() method
     executorService.shutdown();
 }
}