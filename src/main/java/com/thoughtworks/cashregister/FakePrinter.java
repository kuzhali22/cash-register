package com.thoughtworks.cashregister;

public class FakePrinter extends Printer {

    public boolean called;

    public void print(String content) {

        called = true;
    }

}
