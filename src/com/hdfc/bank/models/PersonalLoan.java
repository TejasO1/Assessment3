package com.hdfc.bank.models;

public class PersonalLoan extends Loan {
    private String purpose;
    private double annualInterestRate;
    private int tenureYears;

    public PersonalLoan(int loanId, String customerName, double loanAmount,
                        String purpose, double annualInterestRate, int tenureYears) {
        super(loanId, customerName, loanAmount);
        this.purpose = purpose;
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

    public String getPurpose() {
        return purpose;
    }
}
