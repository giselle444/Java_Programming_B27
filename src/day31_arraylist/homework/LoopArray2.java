package day31_arraylist.homework;

import java.util.ArrayList;

public class LoopArray2 {
    public static void main(String[] args) {

        /*Try to loop:

        Create an ArrayList of Double elements
        Fill the ArrayList with some values
        Find the max element from the ArrayList

         */


        ArrayList<Double> values= new ArrayList<>();

        for (double i =0 ; i <=10 ; i++) {
            values.add(i);

        }
        System.out.println(values);
        double max=0;
        for (int i = 0; i < values.size() ; i++) {

           if (max < values.get(i)){
               max= values.get(i);
           }


        }
        System.out.println(max);
    }
}
