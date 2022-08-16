package day15_string;

public class CharAtMethod {
    public static void main(String[] args) {

        String s = "java";
        //0123
        System.out.println("First char " + s.charAt(0));
        System.out.println("Second char " + s.charAt(1));
        System.out.println("Third char " + s.charAt(2));
        System.out.println("Fourth char " + s.charAt(3)); // s.charAt(s.length()-1)
        //System.out.println("Invalid char: " + s.charAt(100)); --> 100 is invalid index in our string

        System.out.println("Length " + s.length());
        System.out.println("Last index: " + 3);

        //reverse my String, hardcoded. My goal is to see: avaj
        //USE PRINT NOT PRINTLN for the word to print on one line
        System.out.print(s.charAt(3));
        System.out.print(s.charAt(2));
        System.out.print(s.charAt(1));
        System.out.print(s.charAt(0));
        System.out.println();

        System.out.println("" + s.charAt(3) + s.charAt(2) + s.charAt(1) + s.charAt(0));
    }
}
