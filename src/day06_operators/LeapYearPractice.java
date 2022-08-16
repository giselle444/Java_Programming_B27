package day06_operators;

public class LeapYearPractice {
    public static void main(String[] args) {

        /*
         declare and assign a year variable
        check if the year is a leap year, a year will be a leap year if it is divisible by 4

         */

        int year = 1997;
        boolean isLeapYear = year % 4 == 0;
        System.out.println("The year " + year + " is a leap year: " + isLeapYear);



    }
}
