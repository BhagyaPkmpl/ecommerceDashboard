package com.ecommerceDashboard.DTO;
import java.time.LocalDateTime;

public class ProductCategoryFilterRequest {
    private String country;
    private Integer ageFrom;
    private Integer ageTo;
    private String paymentMethod;
    private LocalDateTime transactionDateFrom;
    private LocalDateTime transactionDateTo;

    // Getters and Setters

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getAgeFrom() {
        return ageFrom;
    }

    public void setAgeFrom(Integer ageFrom) {
        this.ageFrom = ageFrom;
    }

    public Integer getAgeTo() {
        return ageTo;
    }

    public void setAgeTo(Integer ageTo) {
        this.ageTo = ageTo;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public LocalDateTime getTransactionDateFrom() {
        return transactionDateFrom;
    }

    public void setTransactionDateFrom(LocalDateTime transactionDateFrom) {
        this.transactionDateFrom = transactionDateFrom;
    }

    public LocalDateTime getTransactionDateTo() {
        return transactionDateTo;
    }

    public void setTransactionDateTo(LocalDateTime transactionDateTo) {
        this.transactionDateTo = transactionDateTo;
    }
}
