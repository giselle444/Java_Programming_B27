package day27_methods.homework;

public class OddNumber {
    /*
    create a method that can print odd numbers between 1-100 in the
same line saperated by space
     */

    public static void oddNumber(){
        for (int i = 1; i <=99 ; i++) {
            if (i % 2 !=0){

                System.out.print(i + " ");
            }

        }
    }

    public static void main(ex4[] args) {
        oddNumber();
    }
}
