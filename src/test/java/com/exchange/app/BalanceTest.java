package com.exchange.app;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class BalanceTest {

    @Test
    public void exchange500() {
        Balance balance = new Balance(500);
        assertEquals(balance.getBanknote(500), 1);
        assertEquals(balance.getBanknote(100), 0);
        assertEquals(balance.getBanknote(50), 0);
        assertEquals(balance.getBanknote(20), 0);
        assertEquals(balance.getBanknote(10), 0);
    }

    @Test
    public void exchange100() {
        Balance balance = new Balance(100);
        assertEquals(balance.getBanknote(500), 0);
        assertEquals(balance.getBanknote(100), 1);
        assertEquals(balance.getBanknote(50), 0);
        assertEquals(balance.getBanknote(20), 0);
        assertEquals(balance.getBanknote(10), 0);
    }

    @Test
    public void exchange50() {
        Balance balance = new Balance(50);
        assertEquals(balance.getBanknote(500), 0);
        assertEquals(balance.getBanknote(100), 0);
        assertEquals(balance.getBanknote(50), 1);
        assertEquals(balance.getBanknote(20), 0);
        assertEquals(balance.getBanknote(10), 0);
    }

    @Test
    public void testExchange20() {
        Balance balance = new Balance(20);
        assertEquals(balance.getBanknote(500), 0);
        assertEquals(balance.getBanknote(100), 0);
        assertEquals(balance.getBanknote(50), 0);
        assertEquals(balance.getBanknote(20), 1);
        assertEquals(balance.getBanknote(10), 0);
    }

    @Test
    public void testExchange10() {
        Balance balance = new Balance(10);
        assertEquals(balance.getBanknote(500), 0);
        assertEquals(balance.getBanknote(100), 0);
        assertEquals(balance.getBanknote(50), 0);
        assertEquals(balance.getBanknote(20), 0);
        assertEquals(balance.getBanknote(10), 1);
    }

    @Test
    public void testExchange700() {
        Balance balance = new Balance(700);
        assertEquals(balance.getBanknote(500), 1);
        assertEquals(balance.getBanknote(100), 2);
        assertEquals(balance.getBanknote(50), 0);
        assertEquals(balance.getBanknote(20), 0);
        assertEquals(balance.getBanknote(10), 0);
    }

    public void testExchange750() {
        Balance balance = new Balance(750);
        assertEquals(balance.getBanknote(500), 1);
        assertEquals(balance.getBanknote(100), 2);
        assertEquals(balance.getBanknote(50), 1);
        assertEquals(balance.getBanknote(20), 0);
        assertEquals(balance.getBanknote(10), 0);
    }

    @Test
    public void testExchange770() {
        Balance balance = new Balance(770);
        assertEquals(balance.getBanknote(500), 1);
        assertEquals(balance.getBanknote(100), 2);
        assertEquals(balance.getBanknote(50), 1);
        assertEquals(balance.getBanknote(20), 1);
        assertEquals(balance.getBanknote(10), 0);
    }

    @Test
    public void testExchange780() {
        Balance balance = new Balance(780);
        assertEquals(balance.getBanknote(500), 1);
        assertEquals(balance.getBanknote(100), 2);
        assertEquals(balance.getBanknote(50), 1);
        assertEquals(balance.getBanknote(20), 1);
        assertEquals(balance.getBanknote(10), 1);
    }

    @Test
    public void testExchange6() {
        Balance balance = new Balance(6);
        assertEquals(balance.getBanknote(500), 0);
        assertEquals(balance.getBanknote(100), 0);
        assertEquals(balance.getBanknote(50), 0);
        assertEquals(balance.getBanknote(20), 0);
        assertEquals(balance.getBanknote(10), 0);
    }

    @Test
    public void testgetBanknoteWithInvalidValue() {
        Balance balance = new Balance(50);
        assertEquals(balance.getBanknote(1000), 0);
    }
}
