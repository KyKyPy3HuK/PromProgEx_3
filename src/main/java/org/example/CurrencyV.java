package org.example;
public class CurrencyV {
    private double currencyCoef;
    protected CurrencyV(double currencyCoef){
        this.currencyCoef = currencyCoef;
    }
    double getCurrencyCoef(){
        return currencyCoef;
    }
    void setCurrencyCoef(double currencyCoef){
        this.currencyCoef = currencyCoef;
    }

    @Override
    public String toString() {
        return "CurrencyV{" +
                "currencyCoef=" + currencyCoef +
                '}';
    }
}