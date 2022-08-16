package day26_multi_array;

import day23_array.homework.Array;

import java.util.Arrays;

public class Groups {
    public static void main(String[] args) {


        String[][] cydeo = {
                {"Alen", "Tina", "Alena", "Nargiza"},
                {"Anam", "Baz", "Busra", "Ostap"},
                {"Rabia", "Shahad"},
                {"Ketino", "Eylul", "Nadia"}
        };
        System.out.println(Arrays.deepToString(cydeo)); //prints the whole 2D array
        System.out.println(cydeo.length); //how many inner, 1D array is there --> how many elements in the 2D array
        System.out.println(cydeo[2].length); // {"Rabia", "Shahad"} -- >2
        System.out.println(cydeo[0][3]); // accessing one specific String element from the inner array at index 0 and giving back the elements at index 3 -->Nargiza
        System.out.println(Arrays.toString(cydeo[1])); // prints whole array  {"Anam", "Baz", "Busra", "Ostap"}

        System.out.println("------------");

        //How to: loop through each inner array

        for (String[] eachInner : cydeo) { //to loop thru a 2D array, the elements type is a 1D array
            System.out.println(Arrays.toString(eachInner));
        }
        System.out.println("---------------");
        //how to loop thru each name

        for (String[] eachInner : cydeo) {
            for (String eachName : eachInner) {
                System.out.println(eachName);
            }
        }
        System.out.println("___________");

        //How to loop thru each name and print the first letter in Uppercase
        for (String[] eachInner : cydeo) {
            for (String eachName : eachInner) {
                System.out.println(eachName.substring(eachName.length() - 1).toUpperCase());

            }
        }
    }
}