package com.apolis.main;

import java.util.concurrent.Callable;

//Class 1
//Helper Class implementing runnable interface Callable
class Task implements Callable<String> {
 // Member variable of this class
 private String message;

 // Constructor of this class
 public Task(String message)
 {
     // This keyword refers to current instance itself
     this.message = message;
 }

 // Method of this Class
 public String call() throws Exception
 {
     return "Hiiii " + message + "!";
 }
}