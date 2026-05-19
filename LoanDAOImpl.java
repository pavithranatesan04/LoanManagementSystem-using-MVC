package com.loan.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.loan.model.Loan;
import com.loan.util.DBConnection;

public class LoanDAOImpl implements LoanDAO {

    Connection con = DBConnection.getConnection();

    @Override
    public void addLoan(Loan loan) {

        try {

            String query =
            "INSERT INTO loan(borrowername,loanamount,interestrate,status) VALUES(?,?,?,?)";

            PreparedStatement ps =
                    con.prepareStatement(query);

            ps.setString(1, loan.getBorrowerName());

            ps.setDouble(2, loan.getLoanAmount());

            ps.setFloat(3, loan.getInterestRate());

            ps.setString(4, loan.getStatus());

            ps.executeUpdate();

        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    @Override
    public List<Loan> getAllLoans() {

        List<Loan> list = new ArrayList<>();

        try {

            String query = "SELECT * FROM loan";

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(query);

            while(rs.next()) {

                Loan loan = new Loan();

                loan.setLoanId(rs.getInt("loanid"));

                loan.setBorrowerName(
                        rs.getString("borrowername"));

                loan.setLoanAmount(
                        rs.getDouble("loanamount"));

                loan.setInterestRate(
                        rs.getFloat("interestrate"));

                loan.setStatus(
                        rs.getString("status"));

                list.add(loan);
            }

        } catch (Exception e) {

            e.printStackTrace();
        }

        return list;
    }

    @Override
    public void updateLoan(Loan loan) {

        try {

            String query =
            "UPDATE loan SET borrowername=?, loanamount=?, interestrate=?, status=? WHERE loanid=?";

            PreparedStatement ps =
                    con.prepareStatement(query);

            ps.setString(1, loan.getBorrowerName());

            ps.setDouble(2, loan.getLoanAmount());

            ps.setFloat(3, loan.getInterestRate());

            ps.setString(4, loan.getStatus());

            ps.setInt(5, loan.getLoanId());

            ps.executeUpdate();

        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    @Override
    public void deleteLoan(int id) {

        try {

            String query =
                    "DELETE FROM loan WHERE loanid=?";

            PreparedStatement ps =
                    con.prepareStatement(query);

            ps.setInt(1, id);

            ps.executeUpdate();

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}