package org.example;

import junit.framework.TestCase;
import org.junit.Test;

public class CumulativeDepositTest extends TestCase {
    private CumulativeDeposit cumulativeDeposit = new CumulativeDeposit(1000, 10.0d, 30, new CurrencyV(1));
    @Test
    public void testChangeCurrency() {
        CumulativeDeposit cumulativeDeposit1 = new CumulativeDeposit(1000, 10.0d, 30, new CurrencyV(1));
        cumulativeDeposit1.changeCurrency(new CurrencyV(10));
        Double targetValue = 100d ;
        assertEquals(targetValue,cumulativeDeposit1.getDepositSum());
    }
    @Test
    public void testCalculateAccruals() {
        Double targetValue = 1000 * 0.1 * (30 / 30.0);
        assertEquals(targetValue,cumulativeDeposit.calculateAccruals());
    }
    @Test
    public void testAddSum() {
        CumulativeDeposit cumulativeDeposit1 = new CumulativeDeposit(1000, 10.0d, 30, new CurrencyV(1));
        Double targetValue = 1500d;
        cumulativeDeposit1.addSum(500d);
        assertEquals(targetValue, cumulativeDeposit1.getDepositSum());
    }
    @Test
    public void testTakeSum() {
        CumulativeDeposit cumulativeDeposit1 = new CumulativeDeposit(1000, 10.0d, 30, new CurrencyV(1));
        Double targetValue = 300d;
        assertEquals(targetValue, cumulativeDeposit1.takeSum(700d));
    }
    @Test
    public void testTakeSumNotNormal() {
        CumulativeDeposit cumulativeDeposit1 = new CumulativeDeposit(1000, 10.0d, 30, new CurrencyV(1));
        Double targetValue = -1d;
        assertEquals(targetValue, cumulativeDeposit1.takeSum(1200d));
        assertEquals(targetValue, cumulativeDeposit1.takeSum(-200d));
    }
}