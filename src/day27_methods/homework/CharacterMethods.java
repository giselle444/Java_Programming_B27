package day27_methods.homework;

public class CharacterMethods {
    /*
    Print each one in one line

    - make method that will print all the letters from A to Z

    - make method that will print all the letters from a to z

    - make method that will print all the letters from Z to A

    - make method that will print all the letters from z to a

    - make method that will print all the letters from 0 to 9


     */
public static void capitalLetters(){
    for (char i= 'A'; i <= 'Z'; i++) {
        System.out.print(i + " ");



    }
}
    public static void lowercaseLetters(){
        for (char i = 'a'; i <= 'z'; i++){
            System.out.print(i + " ");

        }

}
    public static void reverseCapital(){
        for (char i = 'Z'; i >= 'A'; i--) {
            System.out.print(i + " ");

        }


    }
    public static void lowercaseReverse(){
    for (char i = 'z'; i >= 'a';i--){
        System.out.print(i + " ");

    }
    }
    public static void numbers(){
    for (int i= 0; i <= 9; i++){
        System.out.print(i + " ");

    }
    }

    public static void main(ex4[] args) {
        capitalLetters();
        System.out.println();


        lowercaseLetters();
        System.out.println();


        reverseCapital();
        System.out.println();


        lowercaseReverse();
        System.out.println();


        numbers();
        System.out.println();
    }





    }

