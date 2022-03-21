package com.thoughtworks.cashregister;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CashRegisterTest {

    @Test
    public void checkIfPrinterIsInvokedWhenProcessIsCalled() {

        FakePrinter fakePrinter = new FakePrinter();
        CashRegister cashRegister = new CashRegister(fakePrinter);
        Purchase purchase = new Purchase(List.of(new Item("Apples", 100.0)));

        cashRegister.process(purchase);

        assertTrue(fakePrinter.called);
    }

    @Test
    public void checkIfPrinterIsInvokedWhenProcessIsCalledForEmptyList() {

        FakePrinter fakePrinter = new FakePrinter();
        CashRegister cashRegister = new CashRegister(fakePrinter);
        Purchase purchase = new Purchase(Collections.emptyList());

        cashRegister.process(purchase);

        assertTrue(fakePrinter.called);
    }

    @Test
    public void checkIfPurchaseDetailsArePrintedWhenPrinterIsInvoked() {

        FakePrinter fakePrinter = new FakePrinter();
        CashRegister cashRegister = new CashRegister(fakePrinter);
        FakePurchase fakePurchase = new FakePurchase(Collections.emptyList());
        fakePurchase.setString("Check Values");

        cashRegister.process(fakePurchase);

        assertEquals("Check Values",fakePurchase.asString());
    }

}
