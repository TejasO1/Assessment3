package com.hdfc.bank.services;

import com.hdfc.bank.models.*;

public class LoanService {
    public void printLoanSummary(Loan loan) {
        String type = loan.getClass().getSimpleName();
        double emi = loan.calculateEMI();
        System.out.printf("Loan ID: %d | Customer: %s | Type: %s | EMI: %.1f%n",
                loan.getLoanId(), loan.getCustomerName(), type, emi);
    }
}
