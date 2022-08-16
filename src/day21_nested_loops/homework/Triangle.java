package day21_nested_loops.homework;

public class Triangle {
    public static void main(String[] args) {
        /*
        Print this shape:

    * * * * * * * *
    * * * * * * *
    * * * * * *
    * * * * *
    * * * *
    * * *
    * *
    *
         */

        for (int i = 8; i >0 ; i--) {

            for (int j = 0; j < i; j++) {
                System.out.print(" * ");

            }

        }
    }
}
