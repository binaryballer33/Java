package com.shaquille;

import com.shaquille.finance.Finance;

public class ApprenticePayClient {
    public static void main(String[] args) {
        // could run the code without using an apprentice instance
        Finance.calculatePay(53.13, 0,0, 0,
                0, 40, 45, 50, 60);

        // could run the code using an apprentice instance
//        Apprentice shaquille = new Apprentice("Shaquille", 53.13,
//                40, 2592, 3450,
//                14000, 17500);
//        Finance.calculatePay(shaquille.getPayRate(), shaquille.getGiBillHousingRate(), shaquille.getVaDisabilityPay(),
//                shaquille.getSignOnBonusTotal(), shaquille.getStocksVestingAmount(), shaquille.getHoursWorkedInAWeek());
    }
}