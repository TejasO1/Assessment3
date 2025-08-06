package com.hdfc.bank.services;

import com.hdfc.bank.models.*;

public class LoanService {

    // Demonstrates polymorphism
    public void printEMIDetails(Loan loan) {
        // Dynamic dispatch: calls the correct calculateEMI() at runtime
        double emi = loan.calculateEMI();
        String type = loan.getClass().getSimpleName();

        System.out.printf("Loan ID: %d | Customer: %s | Type: %s | EMI: %.1f%n",
                loan.getLoanId(), loan.getCustomerName(), type, emi);

        // Downcasting with instanceof
        if (loan instanceof HomeLoan) {
            HomeLoan hl = (HomeLoan) loan;
            System.out.println("  Property Address: " + hl.getPropertyAddress());
        }
        else if (loan instanceof PersonalLoan) {
            PersonalLoan pl = (PersonalLoan) loan;
            System.out.println("  Purpose: " + pl.getPurpose());
        }
    }
}
