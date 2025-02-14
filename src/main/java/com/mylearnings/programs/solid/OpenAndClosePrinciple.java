package com.mylearnings.programs.solid;

public class OpenAndClosePrinciple {


}

interface Payment{
    void pay();
}

class CreditCardPayment implements Payment{
    @Override
    public void pay() {

    }
}

class DebitCardPayment implements Payment{
    @Override
    public void pay() {

    }
}
