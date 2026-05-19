package com.loan.dao;

import java.util.List;
import com.loan.model.Loan;

public interface LoanDAO {

    void addLoan(Loan loan);

    List<Loan> getAllLoans();

    void updateLoan(Loan loan);

    void deleteLoan(int id);
}
