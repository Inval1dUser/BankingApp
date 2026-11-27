package com.bankingapp.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Transaction {
    private Long transactionId;
    private LocalDateTime transactionDate;
    private String transactionType;
    private BigDecimal amount;
    private BigDecimal resultingBalance;
    private Long senderAccountNum;
    private String senderRouting;
    private String receiverRouting;
    private Long receiverAccountNum;
    private Long initiatedByEmployeeId;

    public Transaction() {
    }

    public Transaction(Long transactionId, LocalDateTime transactionDate, String transactionType,
                       BigDecimal amount, BigDecimal resultingBalance, Long senderAccountNum,
                       String senderRouting, String receiverRouting, Long receiverAccountNum,
                       Long initiatedByEmployeeId) {
        this.transactionId = transactionId;
        this.transactionDate = transactionDate;
        this.transactionType = transactionType;
        this.amount = amount;
        this.resultingBalance = resultingBalance;
        this.senderAccountNum = senderAccountNum;
        this.senderRouting = senderRouting;
        this.receiverRouting = receiverRouting;
        this.receiverAccountNum = receiverAccountNum;
        this.initiatedByEmployeeId = initiatedByEmployeeId;
    }

    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

    public LocalDateTime getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(LocalDateTime transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getResultingBalance() {
        return resultingBalance;
    }

    public void setResultingBalance(BigDecimal resultingBalance) {
        this.resultingBalance = resultingBalance;
    }

    public Long getSenderAccountNum() {
        return senderAccountNum;
    }

    public void setSenderAccountNum(Long senderAccountNum) {
        this.senderAccountNum = senderAccountNum;
    }

    public String getSenderRouting() {
        return senderRouting;
    }

    public void setSenderRouting(String senderRouting) {
        this.senderRouting = senderRouting;
    }

    public String getReceiverRouting() {
        return receiverRouting;
    }

    public void setReceiverRouting(String receiverRouting) {
        this.receiverRouting = receiverRouting;
    }

    public Long getReceiverAccountNum() {
        return receiverAccountNum;
    }

    public void setReceiverAccountNum(Long receiverAccountNum) {
        this.receiverAccountNum = receiverAccountNum;
    }

    public Long getInitiatedByEmployeeId() {
        return initiatedByEmployeeId;
    }

    public void setInitiatedByEmployeeId(Long initiatedByEmployeeId) {
        this.initiatedByEmployeeId = initiatedByEmployeeId;
    }
}
