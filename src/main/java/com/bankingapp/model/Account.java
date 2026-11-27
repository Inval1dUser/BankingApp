package com.bankingapp.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Account {
    private Long accountNum;
    private String routingNum;
    private Long customerId;
    private String accountType;
    private String status;
    private BigDecimal balance;
    private LocalDateTime closedAt;

    public Account(){

    }

    public Account(Long accountNum, String routingNum,
                   Long customerId, String accountType,
                   String status, BigDecimal balance,
                   LocalDateTime closedAt) {
        this.accountNum = accountNum;
        this.routingNum = routingNum;
        this.customerId = customerId;
        this.accountType = accountType;
        this.status = status;
        this.balance = balance;
        this.closedAt = closedAt;
    }

    public String getRoutingNum() {
        return routingNum;
    }

    public void setRoutingNum(String routingNum) {
        this.routingNum = routingNum;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public Long getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(Long accountNum) {
        this.accountNum = accountNum;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getClosedAt() {
        return closedAt;
    }

    public void setClosedAt(LocalDateTime closedAt) {
        this.closedAt = closedAt;
    }
}
