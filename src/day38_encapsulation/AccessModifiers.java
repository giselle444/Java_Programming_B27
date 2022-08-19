package day38_encapsulation;

public class AccessModifiers {

    public int a=5;// access anywhere
    int b=10; //this has default access bc didnt use any other modifier -> within the package

    private int c= 20; // can use within the class

    public static void main(String[] args) {
        AccessModifiers obj= new AccessModifiers();
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);
    }


}
