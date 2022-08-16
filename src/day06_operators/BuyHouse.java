package day06_operators;

public class BuyHouse {
    public static void main(String[] args) {
     /*
        declare and assign a credit score variable
        declare and assign a salary

        determine if you can get a loan to buy a house
        there is two ways to get a loan:
        credit score of 720 or above and salary of 100,000 or above
        credit score of 740 or above and salary of 80,000 or above

      */

        /*int creditScore = 736;
        int salary = 100_000;
        boolean loanApproved = creditScore > 730 && salary >= 100_000 || creditScore > 740 && salary >= 80_000;
        System.out.println("With a credit score of : " + creditScore + " and salary of : $" + salary +
                " you can get a loan approved?" + loanApproved);

         */

        int creditScore = 720;
        double salary = 80_000.0;
        boolean loanApproved = creditScore >= 720 && salary >= 100_000.0 || creditScore >= 740 && salary >= 80_000.0;
        System.out.println( "With a credit score of :" +creditScore + " and a salary of:$ " + salary + " you can get a loan approved: "
                            + loanApproved);






    }
}
