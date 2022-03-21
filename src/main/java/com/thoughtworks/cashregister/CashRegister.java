package com.thoughtworks.cashregister;




public class CashRegister {

    public boolean called ;
    public void process(Purchase purchase){
        FakePrinter printer = new FakePrinter();
        printer.print(purchase.asString());
        called = FakePrinter.called;


    }
}
