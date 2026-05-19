package com.loan.model;


public class Loan {

    private int loanId;
    private String borrowerName;
    private double loanAmount;
    private float interestRate;
    private String status;

    public Loan() {
    }

    public Loan(int loanId, String borrowerName,
                double loanAmount, float interestRate,
                String status) {

        this.loanId = loanId;
        this.borrowerName = borrowerName;
        this.loanAmount = loanAmount;
        this.interestRate = interestRate;
        this.status = status;
    }

    public int getLoanId() {
        return loanId;
    }

    public void setLoanId(int loanId) {
        this.loanId = loanId;
    }

    public String getBorrowerName() {
        return borrowerName;
    }

    public void setBorrowerName(String borrowerName) {
        this.borrowerName = borrowerName;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public float getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(float interestRate) {
        this.interestRate = interestRate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
