package com.thoughtworks.cashregister;

import java.util.List;

public class FakePurchase extends Purchase{

    public String itemValues;

    public FakePurchase(List<Item> items) {
        super(items);
    }

    @Override
    public String asString() {
        return this.itemValues;
    }

    public void setString(String string){
        this.itemValues = string;
    }
}
