package day16_string.homework;

import java.util.Scanner;

public class RelativeChecker {
    /*

Given two full names check if the two people are related. They will be considered to be related if they have the same last name

    Input:
        James Bond
        Jamie Bond
    Output:
        Related

    -------------------

    Input:
        James Bond
        Alex Benji
    Output:
        Not Related


     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println(" Enter your first name");
        String firstName1 = input.nextLine();
        System.out.println("Enter your last name");
        String lastName1 = input.nextLine();

        System.out.println("Person 2, Enter your first name ");
        String firstName2 = input.nextLine();
        System.out.println("Person2, Enter your last name");
        String lastName2 = input.nextLine();

        if (lastName1.equalsIgnoreCase(lastName2)) {
            System.out.println("Related");
        } else {
            System.out.println("Not related");
        }


    }
}


