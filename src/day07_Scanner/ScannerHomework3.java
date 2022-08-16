package day07_Scanner;

import java.util.Scanner;

public class ScannerHomework3 {
    public static void main(String[] args) {
        /*
        Create a program that will ask the user to enter 3 angle numbers ( can be floating numbers )
        Determine if the angles make a triangle, which means the angles add to 180.0
        and Determine if the angles make a circle, which means the angles add to 360.0
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 3 angle numbers: ");
        double angle1 = input.nextDouble();
        double angle2 = input.nextDouble();
        double angle3 = input.nextDouble();
        double totalAngles = angle1 + angle2 + angle3;

        if (totalAngles == 180) {
            System.out.println("according to the total of the angles, the shape is a triangle.");
        } else if (totalAngles == 360) {

            System.out.println("According he total of angles, the shape is circle.");
        } else {
            System.out.println("according to the total of angles, the shape is not a triangle or circle");

            //alt solution
            /*
            boolean isTriangle = totalAngles ==180;
            boolean isCircle= totalAngles == 360
            System.out.println("isCircle = " + isCircle);
            System.out.println("isTriangle =" + isTriangle);




             */


        }
    }
}

