package org.example;
public class SavingDeposit extends SuperDeposit implements Deposit{
    String type = SAVING_DEPOSIT;
    public SavingDeposit(double sum, double monthlyPercent, int term, CurrencyV currency){
        this.sum = sum;
        this.monthlyPercent = monthlyPercent;
        this.termInDays = term;
        this.currency = currency;
    }
    @Override
    public String getDepositType() {
        return this.type;
    }

    @Override
    public String toString() {
        return "SavingDeposit{" +
                "type='" + type + '\'' +
                "} " + super.toString();
    }
}