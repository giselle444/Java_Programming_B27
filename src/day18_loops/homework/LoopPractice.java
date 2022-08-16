package day18_loops.homework;

public class LoopPractice {
    /*
    write a program that will add all the numbers from 1 - 500
     */

    public static void main(String[] args) {

        int count=1;
        int limit=500;

        do {
            System.out.println(count + " ");
            count++;
        }while (count<=limit);


    }
}
