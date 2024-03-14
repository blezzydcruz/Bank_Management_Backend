package com.project.avatar_bank.models;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "account_holders")
public class AccountHolder {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private EmploymentStatus employmentStatus;

    @Column
    private String address;

    @Column
    private String email;

    @Column
    private String password;

    @Column
    private String phoneNumber;

    @Column
    private LocalDate dateOfBirth;

    private List<BankAccount> bankAccounts;

    public AccountHolder(String firstName, String lastName, EmploymentStatus employmentStatus, String address, String email, String password, String phoneNumber, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employmentStatus = employmentStatus;
        this.address = address;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
        this.bankAccounts = new ArrayList<>();
    }

    public AccountHolder() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public EmploymentStatus getEmploymentStatus() {
        return employmentStatus;
    }

    public void setEmploymentStatus(EmploymentStatus employmentStatus) {
        this.employmentStatus = employmentStatus;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public List<BankAccount> getBankAccounts() {
        return bankAccounts;
    }

    public void setBankAccounts(List<BankAccount> bankAccounts) {
        this.bankAccounts = bankAccounts;
    }
}
