package com.hdfc.bank.main;

import java.util.ArrayList;
import java.util.List;
import com.hdfc.bank.models.*;
import com.hdfc.bank.services.LoanService;

public class Main {
    public static void main(String[] args) {
        List<Loan> loans = new ArrayList<>();

        loans.add(new HomeLoan(101, "Ravi", 2500000, "Mumbai, MH", 8.0, 20));
        loans.add(new PersonalLoan(102, "Neha", 500000, "Wedding", 12.0, 5));

        LoanService service = new LoanService();

        // Upcasting in action (list holds Loan references)
        for (Loan loan : loans) {
            service.printEMIDetails(loan); // polymorphic method call
        }
    }
}
