package day15_string;

import java.util.Locale;

public class Recap {
    public static void main(String[] args) {

        String first = "testing";
        first = first.toUpperCase();
        System.out.println(first);

        String second = "SOFT SKILLS";
        String lowerSecond = second.toLowerCase();
        System.out.println(second);
        System.out.println(lowerSecond);

        String third = "    hello world   ";
        System.out.println(third.length());
        third=third.trim();
        System.out.println(third.length());
        System.out.println(third);
    }
}
