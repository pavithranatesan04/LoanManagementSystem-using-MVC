package com.loan.servlet;

import java.io.IOException;

import com.loan.dao.LoanDAOImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/deleteLoan")
public class DeleteLoanServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        int id =
                Integer.parseInt(
                        request.getParameter("id"));

        LoanDAOImpl dao = new LoanDAOImpl();

        dao.deleteLoan(id);

        response.sendRedirect("viewLoans");
    }
}