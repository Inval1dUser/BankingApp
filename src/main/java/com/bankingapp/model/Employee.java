package com.bankingapp.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Employee {

    private Long employeeId;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String username;
    private String passwordHash;
    private LocalDateTime createdAt;

    public Employee(){
    }

    public Employee(LocalDateTime createdAt, String passwordHash,
                     String username, String lastName, LocalDate dateOfBirth,
                     Long employeeId, String firstName) {
        this.createdAt = createdAt;
        this.passwordHash = passwordHash;
        this.username = username;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.employeeId = employeeId;
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
