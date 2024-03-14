package com.project.avatar_bank.models;

import java.time.LocalDate;

public class Subscription {

    private int id;

    private String subscriptionName;

    private double subscriptionPrice;

    private LocalDate dateOfPayment;

    private boolean isPayed;

    public Subscription(String subscriptionName, double subscriptionPrice, LocalDate dateOfPayment, boolean isPayed) {
        this.subscriptionName = subscriptionName;
        this.subscriptionPrice = subscriptionPrice;
        this.dateOfPayment = dateOfPayment;
        this.isPayed = isPayed;
    }

    public Subscription() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSubscriptionName() {
        return subscriptionName;
    }

    public void setSubscriptionName(String subscriptionName) {
        this.subscriptionName = subscriptionName;
    }

    public double getSubscriptionPrice() {
        return subscriptionPrice;
    }

    public void setSubscriptionPrice(double subscriptionPrice) {
        this.subscriptionPrice = subscriptionPrice;
    }

    public LocalDate getDateOfPayment() {
        return dateOfPayment;
    }

    public void setDateOfPayment(LocalDate dateOfPayment) {
        this.dateOfPayment = dateOfPayment;
    }

    public boolean isPayed() {
        return isPayed;
    }

    public void setPayed(boolean payed) {
        isPayed = payed;
    }
}
