package com.loan.servlet;

import java.io.IOException;
import java.util.List;

import com.loan.dao.LoanDAOImpl;
import com.loan.model.Loan;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/viewLoans")
public class ViewLoanServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        LoanDAOImpl dao = new LoanDAOImpl();

        List<Loan> list = dao.getAllLoans();

        request.setAttribute("loanList", list);

        request.getRequestDispatcher("view/view_loans.jsp")
                .forward(request, response);
    }
}