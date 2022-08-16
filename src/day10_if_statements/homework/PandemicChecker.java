package day10_if_statements.homework;

import java.util.Scanner;

public class PandemicChecker {
    /*
    Write a program that will read a number from the user. This number will be a year.
    Use that given year to figure out if there was a pandemic in that year, and if there was which one.

    Data to use:
        1346-1353: The Black Death
        1665-1666: Great Plague of London
        1770-1772: Russian plague
        1889-1890: Flu pandemic
        1916: American polio epidemic
        1918-1920: Spanish Flu
        2009-2010: H1N1 Swine Flu pandemic
        2014-2016: West African Ebola epidemic
        2020-2021: COVID-19
        Any year not in those ranges: No Pandemic



     */

    public static void main(String[] args) {
        System.out.println("Enter a year");

        Scanner input = new Scanner(System.in);
        int year = input.nextInt();

        System.out.println((year >= 1346 && year <= 1353) ? "The Black Death" :
                (year >= 1665 && year <= 1666) ? "Great Plague of London " : (year >= 1770 && year <= 1772) ? "Russian Plague" :
                        (year >= 1889 && year <= 1890) ? "Flu Pandemic" : (year == 1960) ? "American Polio Epidemic" :
                                (year >= 1918 && year <= 1920) ? "Spanish Flu" : (year >= 2009 && year <= 2010) ? "H1N1 Swine Flu" :
                                        (year >= 1889 && year <= 1890) ? "Flu Pandemic" : (year >= 2014 && year <= 2016) ? "Ebola" :
                                                (year >= 2020 && year <= 2021)? "Covid-19": "No Pandemic");


    }
}
