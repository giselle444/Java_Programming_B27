package day27_methods;

import java.util.Arrays;

public class MergeArrays {
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
                 {10, 20, 30},
                 {5, 10, 15},
                 {1,2,3,4}

         };
        //nums.length== 2
         //nums[0].length+ nums[1].length --> better than hardcoded 6 but not dynamic enough
         // to count total number of elements we need to loop

         int size=0;

         for (int[] eachArray: nums){
           size +=  eachArray.length;
         }
         //purpose of this loop was to count the total number of elements, which should be the size of the merges array

        int[] merged= new int[size];
         int indexToStore=0;

         for (int[] eachArray: nums){
             for (int eachNum: eachArray){

                 merged[indexToStore++]=eachNum;
                 System.out.println(Arrays.toString(merged));
             }
         }


     }
}
