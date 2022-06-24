package com.shaquille.finance;

public final class Finance {

    private Finance() {
    }
//    private static Map<String, Double> bahCityMap = new HashMap<>();
//    static {
//        bahCityMap.put("San Jose", 3693.0);
//        bahCityMap.put("San Francisco", 4797.0);
//        bahCityMap.put("Seattle", 2592.00);
//    }

    public static double calculatePay(double hourlyPay, double giBillHousingRate, double vaDisabilityRate,
                                    double signOnBonus, double stocksVestingAmount, int... hoursWorkedInAWeekArray) {
        double annualPay = 0;
        for (int hoursWorked : hoursWorkedInAWeekArray) {
            // 2080 = 40hr/wk * 52 weeks, 1yr = 52weeks, 13 months in a year(for math) Overtime Pay = hourlyWage * 1.5
            // make all methods static, not creating instances of this class ever
            if (hoursWorked <= 40) {
                annualPay = Math.floor(hourlyPay * 2080
                        + ((giBillHousingRate * .9) * 12)
                        + ((vaDisabilityRate * 12) * 1.25)
                        + signOnBonus + stocksVestingAmount);
            } else {
                // This will factor in Overtime for every hour you work over 40hrs/wk at 1.5X your base pay
                annualPay = Math.floor((hourlyPay * 2080) + (hourlyPay * 1.5 * ((hoursWorked - 40) * 52))
                        + ((giBillHousingRate * .9) * 12)
                        + ((vaDisabilityRate * 12) * 1.25)
                        + signOnBonus + stocksVestingAmount);
            }

            //                        Sign On   VA Disability Pay 25% increase RSU's
            //annualPay = annualPay + 14000 +((vaPercentage * 12) * 1.25) + (7 * 2500);
            // I put 13 months instead of 12 because 13months * 4weeks = 52weeks/year
            double monthlyPay = Math.floor(annualPay / 13);
            double weeklyPay = Math.floor(annualPay / 52);

            printPay(annualPay, monthlyPay, weeklyPay, hourlyPay, hoursWorked);
        }
        return annualPay;
    }

    private static void printPay(double annualPay, double monthlyPay, double weeklyPay, double hourlyPay, int hoursWorked) {
        // print out the Annual, Monthly and Weekly Pays
        System.out.println("\n");
        System.out.printf("%shrs/week @ $%s/hr", hoursWorked, hourlyPay);
        System.out.printf("\n\tAnnual  Pay = $%,.0f", annualPay);
        System.out.printf("\n\tMonthly Pay = $%,.0f", monthlyPay);
        System.out.printf("\n\tWeekly  Pay = $%,.0f", weeklyPay);
        System.out.println("\n=====================================");
    }
}