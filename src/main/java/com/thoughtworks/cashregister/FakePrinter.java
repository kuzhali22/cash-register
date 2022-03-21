package com.thoughtworks.cashregister;

public class FakePrinter extends Printer{

    public static boolean called = false;







    public void print(String content){
        super.print( content);
        called = true;
    }

}
