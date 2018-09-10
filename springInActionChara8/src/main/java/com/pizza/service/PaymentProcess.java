package com.pizza.service;

public class PaymentProcess {
    public PaymentProcess(){}

    public void approveCreditCard(String CreditCard, String expMonth,
                                  String expYear, float amount) throws PaymentException{
        if(amount > 20.00){
            throw new PaymentException();
        }
    }
}
