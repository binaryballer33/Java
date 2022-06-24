package com.shaquille;

public class Apprentice {
    private String name;
    private double payRate;
    private int hoursWorkedInAWeek;
    private double giBillHousingRate;
    private double vaDisabilityPay;
    private double signOnBonusTotal;
    private double stocksVestingAmount;

    public Apprentice() {
        this("Apprenti", 53.13, 40, 0, 0, 0, 0);
    }

    public Apprentice(String name) {
        this(name, 53.13, 40, 0, 0, 0, 0);
    }

    public Apprentice(String name, double payRate, int hoursWorkedInAWeek, double giBillHousingRate, double vaDisabilityPay, double signOnBonusTotal, double stocksVestingAmount) {
        setName(name);
        setPayRate(payRate);
        setHoursWorkedInAWeek(hoursWorkedInAWeek);
        setGiBillHousingRate(giBillHousingRate);
        setVaDisabilityPay(vaDisabilityPay);
        setSignOnBonusTotal(signOnBonusTotal);
        setStocksVestingAmount(stocksVestingAmount);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPayRate() {
        return payRate;
    }

    public boolean setPayRate(double payRate) {
        if (payRate >= 0) {
            this.payRate = payRate;
        } else {
            System.out.println("Unable to Set Pay Rate to a value less than 0");
            return false;
        }
        return true;
    }

    public int getHoursWorkedInAWeek() {
        return hoursWorkedInAWeek;
    }

    public boolean setHoursWorkedInAWeek(int hoursWorkedInAWeek) {
        if (hoursWorkedInAWeek >= 0) {
            this.hoursWorkedInAWeek = hoursWorkedInAWeek;
        } else {
            System.out.println("Unable to Hours Worked In A Week to a value less than 0");
            return false;
        }
        return true;
    }

    public double getGiBillHousingRate() {
        return giBillHousingRate;
    }

    public boolean setGiBillHousingRate(double giBillHousingRate) {
        if (giBillHousingRate >= 0) {
            this.giBillHousingRate = giBillHousingRate;
        } else {
            System.out.println("Unable to Set GI Bill Housing Rate to a value less than 0");
            return false;
        }
        return true;
    }

    public double getVaDisabilityPay() {
        return vaDisabilityPay;
    }

    public void setVaDisabilityPay(double vaDisabilityPay) {
        if (vaDisabilityPay >= 0) {
            this.vaDisabilityPay = vaDisabilityPay;
        } else {
            System.out.println("Unable to Set GI Bill Housing Rate to a value less than 0");
        }
    }

    public double getSignOnBonusTotal() {
        return signOnBonusTotal;
    }

    public void setSignOnBonusTotal(double signOnBonusTotal) {
        if (signOnBonusTotal >= 0) {
            this.signOnBonusTotal = signOnBonusTotal;
        } else {
            System.out.println("Unable to Amazon Sign On Bonus to a value less than 0");
        }
    }

    public double getStocksVestingAmount() {
        return stocksVestingAmount;
    }

    public void setStocksVestingAmount(double stocksVestingAmount) {
        if (stocksVestingAmount >= 0) {
            this.stocksVestingAmount = stocksVestingAmount;
        } else {
            System.out.println("Unable to Set Amazon RSU's vesting to a value less than 0");
        }
    }

}
