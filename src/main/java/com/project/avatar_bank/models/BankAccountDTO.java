package com.project.avatar_bank.models;

import java.util.List;

public class BankAccountDTO {

    private String accountNumber;

    private String sortCode;

    private double balance;

    private BankAccountType bankAccountType;

    private int accountHolderId;

    public BankAccountDTO(String accountNumber, String sortCode, double balance, BankAccountType bankAccountType, int accountHolderId) {
        this.accountNumber = accountNumber;
        this.sortCode = sortCode;
        this.balance = balance;
        this.bankAccountType = bankAccountType;
        this.accountHolderId = accountHolderId;
    }

    public BankAccountDTO() {
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

    public int getAccountHolderId() {
        return accountHolderId;
    }

    public void setAccountHolderId(int accountHolderId) {
        this.accountHolderId = accountHolderId;
    }
}
