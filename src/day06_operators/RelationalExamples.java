package day06_operators;

public class RelationalExamples {
    public static void main(String[] args) {

        System.out.println(3>2);//boolean true
        System.out.println(5>10); //boolean false

        int a = 10;
        int b = 20;
        System.out.println(a<b); // 10<20 true
        System.out.println(a < 15); // 10 < 15 true

        System.out.println(10 == 10); // true
        boolean isEqual= 11 ==5; // another way to write this
        System.out.println(isEqual); //false

        System.out.println( 4 != 20); // 4! means is not equal; true
        System.out.println(20 !=20); // false


    }
}
