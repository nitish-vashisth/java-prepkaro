package com.prepkaro.javaprepkaro.designpatterns.chainOfResponsibility.chainOfResponsibility;

public class Atm {

    public static void main(String[] args) {

        Dollar50Dispenser d50 = new Dollar50Dispenser();
        Dollar20Dispenser d20 = new Dollar20Dispenser();
        Dollar10Dispenser d10 = new Dollar10Dispenser();

        d50.setNextDispenser(d20);
        d20.setNextDispenser(d10);

        Currency currency = new Currency(20);

        d50.dispenseCurrency(currency);

    }
}
