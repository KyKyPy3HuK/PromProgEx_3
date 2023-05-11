package org.example;

import junit.framework.TestCase;
import org.junit.Test;

public class CumulativeDepositTest extends TestCase {
    private CumulativeDeposit cumulativeDeposit = new CumulativeDeposit(1000, 10.0d, 30, new CurrencyV(1));
    @Test
    public void testChangeCurrency() {
        cumulativeDeposit.changeCurrency(new CurrencyV(10));
        Double targetValue = 100d ;
        assertEquals(targetValue,cumulativeDeposit.getDepositSum());
    }
    @Test
    public void testCalculateAccruals() {
    }
    @Test
    public void testAddSum() {
    }
    @Test
    public void testTakeSum() {
    }
}