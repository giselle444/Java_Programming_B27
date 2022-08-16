package day14_string;

public class StringMethods1 {
    public static void main(String[] args) {

        String item = "pen";
        String item2 = new String("pen"); //directly in heap
        System.out.println(item == item2); // checks if the object item is the same object as item2

        String item3 = new String("pen");
        System.out.println(item2 == item3); //compares two objects. They are both in the heap

        System.out.println(item.equals(item2));
        System.out.println(item2.equals(item3));
        System.out.println(item3.equals("pen"));
        System.out.println(item.equals("Pen")); //false
        System.out.println(item.equalsIgnoreCase("Pen")); //check only for matching characters and ignores all the cases

        System.out.println("---------");
        String username = "jamesbond";
        String password = "BOND007";
        System.out.println(username.equals("jamesbond"));//true
        System.out.println(username.equalsIgnoreCase("JAMESBOND"));//true. case sensitivity doesn't matter here, just the characters
        System.out.println(password.equals("bond007"));//false

    }
}
