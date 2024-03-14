package com.project.avatar_bank.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Transaction {

    private int id;
    private String transactionName;

    private double transactionValue;

    private LocalDate dateOfTransaction;

    private boolean isSubscription;

    private List<Subscription> subscriptions;

    public Transaction(String transactionName, double transactionValue, LocalDate dateOfTransaction, boolean isSubscription) {
        this.transactionName = transactionName;
        this.transactionValue = transactionValue;
        this.dateOfTransaction = dateOfTransaction;
        this.isSubscription = isSubscription;
        this.subscriptions = new ArrayList<>();
    }

    public Transaction() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTransactionName() {
        return transactionName;
    }

    public void setTransactionName(String transactionName) {
        this.transactionName = transactionName;
    }

    public double getTransactionValue() {
        return transactionValue;
    }

    public void setTransactionValue(double transactionValue) {
        this.transactionValue = transactionValue;
    }

    public LocalDate getDateOfTransaction() {
        return dateOfTransaction;
    }

    public void setDateOfTransaction(LocalDate dateOfTransaction) {
        this.dateOfTransaction = dateOfTransaction;
    }

    public boolean isSubscription() {
        return isSubscription;
    }

    public void setSubscription(boolean subscription) {
        isSubscription = subscription;
    }

    public List<Subscription> getSubscriptions() {
        return subscriptions;
    }

    public void setSubscriptions(List<Subscription> subscriptions) {
        this.subscriptions = subscriptions;
    }
}
