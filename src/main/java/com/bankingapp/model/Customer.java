package com.bankingapp.model;

import java.time.LocalDate;

public class Customer {
    private Long customerId;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String username;
    private String passwordHash;
    private String ssn;
    private LocalDate accountCreationDate;

    public Customer(){
    }

    public Customer(Long customerId, String lastName,
                     String firstName, LocalDate dateOfBirth,
                     String username, String passwordHash, String ssn,
                     LocalDate accountCreationDate) {
        this.customerId = customerId;
        this.lastName = lastName;
        this.firstName = firstName;
        this.dateOfBirth = dateOfBirth;
        this.username = username;
        this.passwordHash = passwordHash;
        this.ssn = ssn;
        this.accountCreationDate = accountCreationDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public LocalDate getAccountCreationDate() {
        return accountCreationDate;
    }

    public void setAccountCreationDate(LocalDate accountCreationDate) {
        this.accountCreationDate = accountCreationDate;
    }
}
