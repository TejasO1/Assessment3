package com.hdfc.bank.models;

public abstract class Loan {
    public static final String BANK_NAME = "HDFC Life";
    private final int loanId;
    protected String customerName;
    protected double loanAmount;

    public Loan(int loanId, String customerName, double loanAmount) {
        this.loanId = loanId;
        this.customerName = customerName;
        this.loanAmount = loanAmount;
    }

    public final int getLoanId() {
        return loanId;
    }

    public String getCustomerName() {
        return customerName;
    }

    // Abstract EMI calculation method
    public abstract double calculateEMI();
}
