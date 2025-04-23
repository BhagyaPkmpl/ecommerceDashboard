package com.ecommerceDashboard.DTO;

import java.time.LocalDateTime;

public class CountryPurchaseFilterRequest {
    private String paymentMethod;
    private String productCategory;
    private LocalDateTime transactionDateFrom;
    private LocalDateTime transactionDateTo;

    // Getters and Setters

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
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
