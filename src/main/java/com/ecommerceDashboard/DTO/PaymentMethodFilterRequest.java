package com.ecommerceDashboard.DTO;
import java.time.LocalDateTime;

public class PaymentMethodFilterRequest {
    private String paymentMethod;
    private String country;
    private String productCategory;
    private Double purchaseAmountFrom;
    private Double purchaseAmountTo;
    private LocalDateTime transactionDateFrom;
    private LocalDateTime transactionDateTo;

    // Getters and Setters

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public Double getPurchaseAmountFrom() {
        return purchaseAmountFrom;
    }

    public void setPurchaseAmountFrom(Double purchaseAmountFrom) {
        this.purchaseAmountFrom = purchaseAmountFrom;
    }

    public Double getPurchaseAmountTo() {
        return purchaseAmountTo;
    }

    public void setPurchaseAmountTo(Double purchaseAmountTo) {
        this.purchaseAmountTo = purchaseAmountTo;
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
