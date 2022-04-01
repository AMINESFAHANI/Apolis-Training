package com.apolis.main;

import java.sql.SQLException;

public class Abc{

    public  void method1() throws SQLException {
        throw new SQLException();
    }    
    public  void method2() throws SQLException  {
            method1();
    }

}
class Ch {

public static void main(String args[]) {
    Abc abc = new Abc();
//    try {
//        abc.method2();
//        }
//        catch(SQLException e) {
//            System.out.println(e);
//        }
    
    System.out.println("rest of the code executes.");
}
}

