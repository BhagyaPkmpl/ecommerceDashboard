package com.ecommerceDashboard.DTO;

public class Top5ProductsRequest {
    private Integer transactionYear;
    private Integer transactionMonth;
    private Integer transactionMonthWeek;

    public Integer getTransactionYear() {
        return transactionYear;
    }

    public void setTransactionYear(Integer transactionYear) {
        this.transactionYear = transactionYear;
    }

    public Integer getTransactionMonth() {
        return transactionMonth;
    }

    public void setTransactionMonth(Integer transactionMonth) {
        this.transactionMonth = transactionMonth;
    }

    public Integer getTransactionMonthWeek() {
        return transactionMonthWeek;
    }

    public void setTransactionMonthWeek(Integer transactionMonthWeek) {
        this.transactionMonthWeek = transactionMonthWeek;
    }
}
