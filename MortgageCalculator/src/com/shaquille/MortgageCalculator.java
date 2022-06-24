package com.shaquille;

// fix class, methods are correct, but you need more constructors but you can't have the same kind of ctor
// for example double double int
public class MortgageCalculator {
    private double mortgageAmountFinanced;
    private double interestRate;
    private double mortgage;
    private int loanTermInYears;

    public MortgageCalculator(double mortgageAmountFinanced, double interestRate, int loanTermInYears) {
        setMortgageAmountFinanced(mortgageAmountFinanced);
        setInterestRate(interestRate);
        setLoanTermInYears(loanTermInYears);
    }

    public MortgageCalculator(double monthlyMortgage, int loanTermInYears, double interestRate) {
        setMortgage(monthlyMortgage);
        setInterestRate(interestRate);
        setLoanTermInYears(loanTermInYears);
    }

    public void setMortgageAmountFinanced(double mortgageAmountFinanced) {
        this.mortgageAmountFinanced = mortgageAmountFinanced;
    }

    public void setInterestRate(double interestRate) {
        // 6% interest rate / 100 = .06%, to compound this monthly divide by 12 .06/12 = yearlyInterestRate
        this.interestRate = (interestRate / 100) / 12;
    }

    public void setMortgage(double mortgage) {
        this.mortgage = mortgage;
    }

    public void setLoanTermInYears(int loanTermInYears) {
        this.loanTermInYears = loanTermInYears * 12;
    }

    // Formulas for calculations can be found here: https://www.wikihow.com/Calculate-Mortgage-Payments
    public double calculateMortgage() {
        // calculates and returns the monthly mortgage amount
        double mortgage = mortgageAmountFinanced *
                (interestRate * Math.pow(1 + interestRate, loanTermInYears)) /
                (Math.pow(1 + interestRate, loanTermInYears) - 1);
        setMortgage(mortgage);
        return Math.round(mortgage * 100.0) / 100.0;
    }

    public double calculateInterestRate() {
        // calculates and returns the interest rate
        double interestRate = ((Math.pow((1 + this.interestRate/ loanTermInYears), loanTermInYears) - 1) * 1200);
        return Math.round(interestRate * 1000.0) / 1000.0;
    }

    public double calculateMortgageAmountFinanced() {
        // calculates and returns the mortgage amount that you financed
        double mortgageAmountFinanced = (Math.pow(1 + interestRate, loanTermInYears) - 1) * mortgage /
                (interestRate * Math.pow(1 + interestRate, loanTermInYears));
        setMortgageAmountFinanced(mortgageAmountFinanced);
        return Math.round(mortgageAmountFinanced * 100.0) / 100.0;
    }

    public double calculateLoanTerm() {
        // calculates and returns the loan term as a double
        System.out.println("Not Yet Implemented");
        return -1;
    }

    public double calculateTotalInterest() {
        double totalInterest = (mortgage * loanTermInYears) - mortgageAmountFinanced;
        return Math.round(totalInterest * 100.0 ) / 100.0;
    }
}
