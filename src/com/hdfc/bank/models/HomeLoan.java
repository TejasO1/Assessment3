package com.hdfc.bank.models;

public class HomeLoan extends Loan {
    private String propertyAddress;
    private double annualInterestRate;
    private int tenureYears;

    public HomeLoan(int loanId, String customerName, double loanAmount,
                    String propertyAddress, double annualInterestRate, int tenureYears) {
        super(loanId, customerName, loanAmount);
        this.propertyAddress = propertyAddress;
        this.annualInterestRate = annualInterestRate;
        this.tenureYears = tenureYears;
    }

    @Override
    public double calculateEMI() {
        double monthlyRate = (annualInterestRate / 100) / 12;
        int months = tenureYears * 12;
        return (loanAmount * monthlyRate * Math.pow(1 + monthlyRate, months)) /
                (Math.pow(1 + monthlyRate, months) - 1);
    }

    public String getPropertyAddress() {
        return propertyAddress;
    }
}
