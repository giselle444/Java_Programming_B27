package day15_string;

public class StringMethods2 {
    public static void main(String[] args) {
        String word = "java";
        System.out.println(word.startsWith("j")); // true
        System.out.println(word.startsWith("ja")); //true
        System.out.println(word.startsWith("jae")); //false

        System.out.println("----------------");
        System.out.println(word.endsWith("a")); //true
        System.out.println(word.endsWith("A"));//false
        System.out.println(word.endsWith("java"));//true
        System.out.println(word.endsWith("va")); //true
        System.out.println(word.endsWith("va  ")); //false

        boolean b = word.startsWith("hello");

        System.out.println("----------");

        String str = "today it is 80 degrees";
        System.out.println(str);
        System.out.println("str.contains(today))" + str.contains("today"));
        System.out.println("str.contains(it is))" + str.contains("it is"));
        System.out.println("str.contains(degrees))" + str.contains("degrees"));
        System.out.println("str.contains(degrees))" + str.contains("degrees"));
        System.out.println("str.contains(it 80)) exact sequence" + str.contains("it 80")); // contains(it) && contains(80) //false// if you look for "it is 80" that will be true
        //System.out.println("str.contains(it is 80 exact sequence" + str.contains("it is 80")); ----> TRUE
        System.out.println(str.contains("80") && str.contains("today"));









    }
}
