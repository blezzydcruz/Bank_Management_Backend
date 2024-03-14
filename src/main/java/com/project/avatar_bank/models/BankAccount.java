package com.project.avatar_bank.models;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {

    private int id;

    private String accountNumber;

    private String sortCode;

    private double balance;

    private BankAccountType bankAccountType;

    private List<Transaction> transactions;

    public BankAccount(String accountNumber, String sortCode, double balance, BankAccountType bankAccountType) {
        this.accountNumber = accountNumber;
        this.sortCode = sortCode;
        this.balance = balance;
        this.bankAccountType = bankAccountType;
        this.transactions = new ArrayList<>();
    }

    public BankAccount() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getSortCode() {
        return sortCode;
    }

    public void setSortCode(String sortCode) {
        this.sortCode = sortCode;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public BankAccountType getBankAccountType() {
        return bankAccountType;
    }

    public void setBankAccountType(BankAccountType bankAccountType) {
        this.bankAccountType = bankAccountType;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }
}
