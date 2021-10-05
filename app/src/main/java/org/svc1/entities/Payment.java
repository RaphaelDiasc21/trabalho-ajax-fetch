package org.svc1.entities;

public class Payment {
    public Double amount;
    public Integer userId;

    public Double getAmount() {
        return amount;
    }

    public Payment() {
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
