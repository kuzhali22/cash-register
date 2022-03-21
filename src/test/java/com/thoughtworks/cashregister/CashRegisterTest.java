package com.thoughtworks.cashregister;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CashRegisterTest {

    @Test
    public void shouldEquateApplesToRupeesHundred() {

        CashRegister cashRegister = new CashRegister();
        Item item = new Item("Apples",100.0);
        List<Item> items = new ArrayList<>();
        items.add(item);
        Purchase purchase = new Purchase(items);
        cashRegister.process(purchase);
        assertTrue(cashRegister.called);
    }
}