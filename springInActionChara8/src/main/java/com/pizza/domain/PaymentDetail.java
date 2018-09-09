package com.pizza.domain;

import java.io.Serializable;

public class PaymentDetail implements Serializable {
    private static final long serialVersionUID = 1L;

    private Paytype paytype;
    private String creditCardNumber;

    public Paytype getPaytype(){
        return paytype;
    }

    public void setPaytype(Paytype paytype){
        this.paytype = paytype;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }
}
