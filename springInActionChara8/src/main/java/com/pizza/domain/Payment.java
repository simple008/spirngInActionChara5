package com.pizza.domain;

import java.io.Serializable;

public abstract class Payment implements Serializable {
    private static final long SerialVersionUID  = 1L;

    private float amount;
    public void setAmount(float amount){
        this.amount = amount;
    }

    public float getAmount(){
        return amount;
    }
}
