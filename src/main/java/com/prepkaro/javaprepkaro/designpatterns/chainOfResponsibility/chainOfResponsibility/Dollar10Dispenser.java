package com.prepkaro.javaprepkaro.designpatterns.chainOfResponsibility.chainOfResponsibility;

public class Dollar10Dispenser implements  CurrencyDispenser{

    private CurrencyDispenser nextDispenser;

    @Override
    public void setNextDispenser(CurrencyDispenser currencyDispenser) {
        this.nextDispenser = currencyDispenser;
    }

    @Override
    public void dispenseCurrency(Currency cur) {
        if(cur.getAmount() >= 10){
            int num = cur.getAmount()/10;
            int remainder = cur.getAmount() % 10;
            System.out.println("Dispensing "+num+" 10$ note");

            if(remainder !=0)
                this.nextDispenser.dispenseCurrency(new Currency(remainder));
        }else{
            this.nextDispenser.dispenseCurrency(cur);
        }
    }

}
