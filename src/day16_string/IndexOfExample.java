package day16_string;

public class IndexOfExample {
    public static void main(String[] args) {

        String s= "lollipop";
        //01234567
        System.out.println("index of l: " + s.indexOf('l')); //0
        System.out.println("last index of l: " + s.lastIndexOf('l')); //3

        System.out.println("index of i: " + s.indexOf('i')); //4
        System.out.println("last index of i: " + s.lastIndexOf('i')); //4

        System.out.println("index of p: " + s.indexOf('p')); //5
        System.out.println("last index of p: " + s.lastIndexOf('p')); //7

        System.out.println("index of e: " + s.lastIndexOf('e')); //-1
        System.out.println("index of P: " + s.lastIndexOf('P')); //-1
        System.out.println(s.lastIndexOf("I"));
        System.out.println(s.lastIndexOf('I'));
        System.out.println();

        System.out.println("index of pop: " + s.indexOf("pop")); //gives 5 because the sequence "pop starts at index 5
        System.out.println("index of Pop: " + s.indexOf("Pop")); //-1 there is no capital P
        System.out.println("index of lol: " + s.lastIndexOf("lol"));



    }
}
