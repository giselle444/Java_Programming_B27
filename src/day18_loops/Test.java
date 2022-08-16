package day18_loops;


import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        /*
        write a program that will allow the user to select three colors for the painting. There needs to be 3 unique colors selected

         */

        Scanner input = new Scanner(System.in);
        String storedColors = ""; //colors selected by user -> RED, blue, green

        int counter = 1;
        while (counter++ <= 3) { //1 red, 2 blue, 3 green

            System.out.println("Enter a color: ");
            String colorEntered = input.nextLine();

            if (storedColors.contains(colorEntered)) {
                System.out.println("Please enter a unique color.");
                counter--; //2-1=1, one more chance to enter color ->-> counter = counter -1;
            } else { //if all unique colors: red, green, blue
                storedColors += colorEntered + " "; //red, blue, green -> concatenation, " " -> shows space

            }
            //System.out.println(storedColors); //if inside the loop, it will also repeat


        }//while loop closing here
        System.out.println(storedColors);
    }
}


