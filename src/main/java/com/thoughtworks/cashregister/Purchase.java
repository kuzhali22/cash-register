package com.thoughtworks.cashregister;

import java.util.List;
import java.util.stream.Collectors;

public class Purchase {
    private List<Item> items;

    public Purchase(List<Item> items) {
        this.items = items;
    }

    public String asString(){
        return items.stream().map(Object::toString).collect(Collectors.joining());
    }
}
