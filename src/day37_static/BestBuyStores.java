package day37_static;

import java.util.Arrays;

public class BestBuyStores {
    public static void main(String[] args) {

        //BestBuy.location= "fairfax";
        //location is an instance var , so we need an object in order toa ccess

        BestBuy store1= new BestBuy();
        store1.location= "Fairfax";
        System.out.println(store1.location);

        System.out.println( BestBuy.headquarters);
        //this is a static variable so we can use the class name to access it

        System.out.println(store1.headquarters); // this is valid syntax but you should use the class name to access, but instance references

        //other static members

        System.out.println(Math.PI); //PI is static
        System.out.println(Integer.MIN_VALUE);
       // Arrays.sort(); accessing static method from Arrays class

    }
}
