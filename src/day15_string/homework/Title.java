package day15_string.homework;

import java.util.Locale;
import java.util.Scanner;

public class Title {
    /*
    ask the user to enter their name including titles
use the following titles to determine how to refer to the person

handle case sensitivity. User could enter a title as ms, or MS, or Ms. All should result in a valid result

	titles:

		Mr or Mister
		Ms or Miss or Madam
		Dr

	and some titles can come after a name:

		Sr
		Jr

Based on both starting and ending titles print the following messages:

		Mr or Mister: Hello Sir
		Ms or Miss or Madam: Hello Ma'am
		Dr: Hello Doctor

		Sr: Nice to meet you Senior
		Jr: Nice to meet you Junior

Note: It is possible to have both beginning and ending titles, one of them, or none of them


     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your name including your preferred title.");
        String title = input.nextLine().toLowerCase();

        boolean validStart = title.startsWith("ms") || title.startsWith("madam");
        boolean validStart2 = title.startsWith("mr") || title.startsWith("mister");
        boolean validStart3 = title.startsWith("dr");
        boolean validEnd = title.endsWith("jr");
        boolean validEnd2 = title.endsWith("sr");


        if (validStart) {
            System.out.println(title + ": Hello Ma'am");
        } else if (validStart2) {
            System.out.println(title + ": Hello sir");
        } else if (validStart3) {
            System.out.println(title + ": Hello Doctor");
        } else if (validEnd) {
            System.out.println(title + ": Nice to meet you junior");
        } else if (validEnd2) {
            System.out.println(title + ": Nice to meet you senior");
            }

        }







    }

