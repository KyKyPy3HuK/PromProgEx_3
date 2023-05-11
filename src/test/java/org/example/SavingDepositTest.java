package org.example;
import junit.framework.TestCase;
public class SavingDepositTest extends TestCase {

    public void testChangeCurrency() {
        SavingDeposit savingDeposit = new SavingDeposit(1000, 10.0d, 30, new CurrencyV(1));
        savingDeposit.changeCurrency(new CurrencyV(10));
        Double targetValue = 100d ;
        assertEquals(targetValue,savingDeposit.getDepositSum());
    }

    public void testCalculateAccruals() {
        SavingDeposit savingDeposit = new SavingDeposit(1000, 10.0d, 30, new CurrencyV(1));
        Double targetValue = 1000 * 0.1 * (30 / 30.0);
        assertEquals(targetValue,savingDeposit.calculateAccruals());
    }
}