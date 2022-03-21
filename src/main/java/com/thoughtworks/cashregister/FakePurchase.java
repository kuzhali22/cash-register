package com.thoughtworks.cashregister;

import java.util.List;

public class FakePurchase extends Purchase{


    public FakePurchase(List<Item> items) {
        super(items);
    }

    @Override
    public String asString() {
        return "Purchase called";
    }
}
