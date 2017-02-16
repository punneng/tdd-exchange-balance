package com.exchange.app;
import java.util.HashMap;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class BalanceTest
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public BalanceTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( BalanceTest.class );
    }

    public void testExchange500()
    {
        Balance balance = new Balance(500);
        assertEquals( balance.getBanknote(500), 1);
        assertEquals( balance.getBanknote(100), 0);
        assertEquals( balance.getBanknote(50), 0);
        assertEquals( balance.getBanknote(20), 0);
        assertEquals( balance.getBanknote(10), 0);
    }

    public void testExchange100()
    {
        Balance balance = new Balance(100);
        assertEquals( balance.getBanknote(500), 0);
        assertEquals( balance.getBanknote(100), 1);
        assertEquals( balance.getBanknote(50), 0);
        assertEquals( balance.getBanknote(20), 0);
        assertEquals( balance.getBanknote(10), 0);
    }

    public void testExchange50()
    {
        Balance balance = new Balance(50);
        assertEquals( balance.getBanknote(500), 0);
        assertEquals( balance.getBanknote(100), 0);
        assertEquals( balance.getBanknote(50), 1);
        assertEquals( balance.getBanknote(20), 0);
        assertEquals( balance.getBanknote(10), 0);
    }

    public void testExchange20()
    {
        Balance balance = new Balance(20);
        assertEquals( balance.getBanknote(500), 0);
        assertEquals( balance.getBanknote(100), 0);
        assertEquals( balance.getBanknote(50), 0);
        assertEquals( balance.getBanknote(20), 1);
        assertEquals( balance.getBanknote(10), 0);
    }
}
