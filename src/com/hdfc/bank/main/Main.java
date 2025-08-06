package com.hdfc.bank.main;

import java.util.ArrayList;
import java.util.List;
import com.hdfc.bank.models.*;
import com.hdfc.bank.services.LoanService;

public class Main {
    public static void main(String[] args) {
        List<Loan> loans = new ArrayList<>();

        // HomeLoan: 8% annual interest, 20 years tenure
        loans.add(new HomeLoan(01, "Tanish Mhatre", 250000, "Mumbai, MH", 8.0, 20));

        // PersonalLoan: 12% annual interest, 5 years tenure
        loans.add(new PersonalLoan(02, "Shriraj Patil", 50000, "Wedding", 12.0, 5));

        LoanService service = new LoanService();

        for (Loan loan : loans) {
            service.printLoanSummary(loan);
        }
    }
}
