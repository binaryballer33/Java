import com.shaquille.MortgageCalculator;

public class MortgageCalculatorClient {
    public static void main(String[] args) {
        MortgageCalculator rentonLakeHouse = new MortgageCalculator(800_000, 3.5, 30);
        System.out.println(rentonLakeHouse.calculateMortgage());
        System.out.println(rentonLakeHouse.calculateMortgageAmountFinanced());
        System.out.println(rentonLakeHouse.calculateInterestRate());
        System.out.println(rentonLakeHouse.calculateTotalInterest());
//        System.out.println(rentonLakeHouse.calculateLoanTerm());


        MortgageCalculator bellevueLakeHouse = new MortgageCalculator(3592, 30, 3.5);
        System.out.println(bellevueLakeHouse.calculateMortgageAmountFinanced());
        System.out.println(bellevueLakeHouse.calculateMortgage());
        System.out.println(bellevueLakeHouse.calculateInterestRate());
        System.out.println(bellevueLakeHouse.calculateTotalInterest());
//        System.out.println(bellevueLakeHouse.calculateLoanTerm());
    }
}
