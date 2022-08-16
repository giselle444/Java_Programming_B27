package day26_multi_array.homework;

import java.util.Arrays;

public class Practice2 {
    /*
Given a 2D int array merge the elements into one 1D array

Ex:
       int [][] nums = {
                {10, 20, 30}, {5, 10, 15}
        };

       Output:
              [ 10, 20, 30, 5, 10, 15 ]



     */
    public static void main(String[] args) {
        int [][] nums = {
                {10, 20, 30}, {5, 10, 15}
        };

        String s= " ";

        for (int[] eachInner: nums){
            for (int eachNum: eachInner){
                s+= eachNum + " ";
            }
        }
        String[] arr= s.split(" ");
        System.out.println(Arrays.toString(arr));
    }
}
