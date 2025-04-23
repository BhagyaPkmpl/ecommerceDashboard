package com.ecommerceDashboard.DTO;
public class UserMultipleProductFilterRequest {
    private Integer transactionYear;
    private Integer transactionMonth;
    private Integer transactionMonthWeek;
    private String country;
    private Integer ageFrom;
    private Integer ageTo;

    // Getters and Setters
    public Integer getTransactionYear() { return transactionYear; }
    public void setTransactionYear(Integer transactionYear) { this.transactionYear = transactionYear; }

    public Integer getTransactionMonth() { return transactionMonth; }
    public void setTransactionMonth(Integer transactionMonth) { this.transactionMonth = transactionMonth; }

    public Integer getTransactionMonthWeek() { return transactionMonthWeek; }
    public void setTransactionMonthWeek(Integer transactionMonthWeek) { this.transactionMonthWeek = transactionMonthWeek; }

    public String getCountry() { return country; }
    public void setCountry(String country) { this.country = country; }

    public Integer getAgeFrom() { return ageFrom; }
    public void setAgeFrom(Integer ageFrom) { this.ageFrom = ageFrom; }

    public Integer getAgeTo() { return ageTo; }
    public void setAgeTo(Integer ageTo) { this.ageTo = ageTo; }
}