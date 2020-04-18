package com.said.destek.model;

public class MoneyModel {
    String moneyAmount;
    int pennyDigits;
    String currency;
    String pennyType;

    public String getMoneyAmount() {
        return moneyAmount;
    }

    public void setMoneyAmount(String moneyAmount) {
        this.moneyAmount = moneyAmount;
    }

    public int getPennyDigits() {
        return pennyDigits;
    }

    public void setPennyDigits(int pennyDigits) {
        this.pennyDigits = pennyDigits;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getPennyType() {
        return pennyType;
    }

    public void setPennyType(String pennyType) {
        this.pennyType = pennyType;
    }
}
