package day27_methods.homework;

public class EvenNumbers {
    /*
    create a method that can print even numbers between 1-100 in the
same line saperated by space


     */
public static void evenNumbers(){
    for (int i = 2; i <=100 ; i++) {
        if (i % 2==0){

            System.out.print(i + " ");
        }

    }
}

    public static void main(ex4[] args) {
        evenNumbers();
    }

    }


