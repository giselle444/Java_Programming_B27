package day09_if_statements;

public class SingleIfExample {
    public static void main(String[] args) {

        if (true) {
            System.out.println("hello");
        }

        if (false) {
            System.out.println("bye"); // this statement is false so it won't run, only the first true statement runs
        }
        System.out.println("-------");

        int year = 2020;

        if (year == 2020 || year == 2021) {
            System.out.println("Stay Home");
            System.out.println("wash your hands");
            System.out.println("social distance");
        }
        System.out.println("---------");

        double price = 39.99;

        if (price >= 20) {
            System.out.println("free shipping"); //39.99 is greater price than 20, so this is true you get free ship
        }


    }
}
