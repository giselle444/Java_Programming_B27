package day22_array.homework;

import java.util.Scanner;

public class DayOfTheWeek {
    /*
    Create a program that will ask the user to enter a number for the day of the week. Print the day of the week based on:

    1 - Monday
    2 - Tuesday
    ...
    7 - Sunday

Use array, not if statement or switch

     */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the number of the day of the week");
        int num= input.nextInt();

        String[] days={"Monday","Tuesday","Wednesday", "Thursday", "Friday","Saturday","Sunday"};

        if (num >=1 && num <= 7){
            System.out.println(days[num-1]);

        }else {
            System.out.println("That is not a valid number, enter a number of the day 1-7");
        }
    }


}
