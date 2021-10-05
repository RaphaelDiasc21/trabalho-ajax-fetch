package org.svc2.entities;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;

@Entity
public class Payment extends PanacheEntity {
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

    public static Payment findByUserId(Integer userId) {
        return find("userId",userId).firstResult();
    }
}
