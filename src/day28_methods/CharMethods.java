package day28_methods;

public class CharMethods {

    /*
    Print each one in one line

    - make method that will print all the letters from A to Z

    - make method that will print all the letters from a to z

    - make method that will print all the letters from Z to A

    - make method that will print all the letters from z to a

    - make method that will print all the letters from 0 to 9


     */
    public static void main(String[] args) {
        getUpperAtoZ();
        getLowerAtoZ();
        getLowerAtoZ();
        getLowerZtoA();
        getNumber0to9();

    }

    public static void getUpperAtoZ() {
        for (char letter = 'A'; letter <= 'Z'; letter++) {
            System.out.print(letter + " ");

        }
        System.out.println();
    }

    public static void getLowerAtoZ() {
        for (char letter = 'a'; letter <= 'z'; letter++) {
            System.out.print(letter + " ");


        }
        System.out.println();

    }

    public static void getUpperZtoA() {
        for (char letter = 'Z'; letter >= 'A'; letter--) {
            System.out.print(letter + " ");

        }
        System.out.println();
    }

    public static void getLowerZtoA() {
        for (char letter = 'z'; letter >= 'a'; letter--) {
            System.out.print(letter + " ");

        }
        System.out.println();
    }

    public static void getNumber0to9() {
        for (char letter = '0'; letter <= '9'; letter++) {
            System.out.print(letter + " ");

        }
        System.out.println();
    }
}





