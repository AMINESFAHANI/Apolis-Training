package com.apolis.main;
class Child extends Base{
   static void method(){
     System.out.println("method(): Base class");
}
   public static void main(String[] a){
     //Base base = new Child();
     Base base = null;
     base.method();
}
}