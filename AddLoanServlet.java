package com.loan.servlet;

import java.io.IOException;

import com.loan.dao.LoanDAOImpl;
import com.loan.model.Loan;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/addLoan")
public class AddLoanServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        String name =
                request.getParameter("borrowername");

        double amount =
                Double.parseDouble(
                        request.getParameter("loanamount"));

        float rate =
                Float.parseFloat(
                        request.getParameter("interestrate"));

        String status =
                request.getParameter("status");

        Loan loan = new Loan();

        loan.setBorrowerName(name);

        loan.setLoanAmount(amount);

        loan.setInterestRate(rate);

        loan.setStatus(status);

        LoanDAOImpl dao = new LoanDAOImpl();

        dao.addLoan(loan);

        response.sendRedirect("viewLoans");
    }
}
