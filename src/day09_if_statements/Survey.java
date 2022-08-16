package day09_if_statements;

import java.util.Scanner;

public class Survey {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Are you a student? T/F");
        boolean isStudent = input.nextBoolean();

        if (isStudent){
            System.out.println("what are you studying?");
            String subject = input.next();
        }

        System.out.println("do you live in a city? T/F");

        if (input.nextBoolean()){
            System.out.println("Cool, cities are loud and fun");

        } else{
            System.out.println(" How many years have you lived in the suburbs?");
            int years = input.nextInt();
            System.out.println(years);
        }
        input.close();


    }
}
