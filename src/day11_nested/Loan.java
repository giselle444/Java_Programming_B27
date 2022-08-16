package day11_nested;

public class Loan {
    /*
    declare and assign a credit score variable
    try to use ternary to determine of you are eligible for a loan
    you are eligible if you have a credit score of 700 or above

    if you are eligible print "loan approved"
    otherwise print "loan rejected. Sign up for our credit program"
     */
    public static void main(String[] args) {

        double creditScore = 800;
        String result = creditScore > 700 ? "Loan approved": "loan rejected. Sign up for our credit program";
        System.out.println(result);
        /*
        The boolean creditScore > 700 is checked
        if the boolean is true, the value before the colon is returned: loan approved
        if the boolean is false, the value after the colon is returned
         */



    }
}
