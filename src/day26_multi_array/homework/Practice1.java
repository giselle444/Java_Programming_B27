package day26_multi_array.homework;

import java.util.Arrays;

public class Practice1 {
    /*
Given a 2D int array find the max and min number from the whole array

       int[][] {
              {1, 5, 2, 23},
              {-12, 41, -5, -2},
              {1, 5, 1, 5}
       }

       Max: 41
       Min -12

Extra: Find the max and min between each inner array

     */
    public static void main(String[] args) {

        int[][] nums = {
                {1, 5, 2, 23},
                {-12, 41, -5, -2},
                {1, 5, 1, 5}


        };



        int max= nums[0][0];
        int min= nums[0][0];

        for (int[]eachInner: nums){

            for (int eachElement: eachInner){
                if (max <eachElement){
                    max=eachElement;

                }else if ((min > eachElement)){
                    min=eachElement;
                }
            }
            }
        System.out.println(max);
        System.out.println(min);






        }
    }

