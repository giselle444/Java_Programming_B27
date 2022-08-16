package day21_nested_loops.homework;

public class Square {
    public static void main(String[] args) {
        /*
        Print these shapes:

    * * * * * * * * *
    * * * * * * * * *
    * * * * * * * * *
    * * * * * * * * *
    * * * * * * * * *
    * * * * * * * * *
    * * * * * * * * *
    * * * * * * * * *


         */

        for (int i = 1; i < 8 ; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(" * ");

            }
            System.out.println();

        }
    }
}
