package org.example;
public abstract class SuperDeposit implements Deposit{
    double sum;
    double monthlyPercent;
    int termInDays;
    CurrencyV currency;
    String type;
    public double getDepositSum(){
        return this.sum;
    }
    public String getDepositType(){
        return this.type;
    }
    public double getMonthlyPercent() {
        return this.monthlyPercent;
    }
    public void setMonthlyPercent(double monthlyPercent) {
        this.monthlyPercent = monthlyPercent;
    }
    public int getTermInDays(){
        return this.termInDays;
    }
    public CurrencyV getCurrency() {
        return this.currency;
    }
    public void setTermInDays(int termInDays){
        this.termInDays = termInDays;
    }
    public void changeCurrency(CurrencyV currency){
        this.sum = this.sum * this.currency.getCurrencyCoef() / currency.getCurrencyCoef();
        this.currency = currency;
    }
    public double calculateAccruals(){
        return this.sum * this.monthlyPercent * (this.termInDays / 30.0);
    }

    @Override
    public String toString() {
        return "SuperDeposit{" +
                "sum=" + sum +
                ", monthlyPercent=" + monthlyPercent +
                ", termInDays=" + termInDays +
                ", currency=" + currency +
                ", type='" + type + '\'' +
                '}';
    }
}