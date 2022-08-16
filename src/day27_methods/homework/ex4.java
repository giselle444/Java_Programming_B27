package day27_methods.homework;

public class ex4 {
    /*
    create a method that accepts a String and print each character of the String on a separate line


     */
    public static void characters(String str){

        for (int i = 0; i < str.length(); i++) {

            System.out.println(str.charAt(i));


        }

        }

    public static void main(String[] args) {

        characters("java is fun");


    }
    }









