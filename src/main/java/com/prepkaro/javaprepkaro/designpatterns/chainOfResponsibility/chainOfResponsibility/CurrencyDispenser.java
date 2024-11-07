package com.prepkaro.javaprepkaro.designpatterns.chainOfResponsibility.chainOfResponsibility;

public interface CurrencyDispenser {

   public void setNextDispenser(CurrencyDispenser currencyDispenser);

    public void dispenseCurrency(Currency currency);
}
