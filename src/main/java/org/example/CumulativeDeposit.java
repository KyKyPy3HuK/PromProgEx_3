package org.example;
public class CumulativeDeposit extends SuperDeposit implements Deposit{
    String type = CUMULATIVE_DEPOSIT;
    public CumulativeDeposit(double sum, double monthlyPercent, int term, CurrencyV currency){
        this.sum = sum;
        this.monthlyPercent = monthlyPercent;
        this.termInDays = term;
        this.currency = currency;
    }
    @Override
    public String getDepositType() {
        return this.type;
    }
    public void addSum(double sum){
        super.sum += sum;
    }
    public double takeSum(double targetSum){
        if (super.sum >= targetSum){
            super.sum -= targetSum;
            return targetSum;
        }
        return -1;
    }

    @Override
    public String toString() {
        return "CumulativeDeposit{" +
                "type='" + type + '\'' +
                "} " + super.toString();
    }
}