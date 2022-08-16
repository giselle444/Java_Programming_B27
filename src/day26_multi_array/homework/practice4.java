package day26_multi_array.homework;

import javax.swing.*;

public class practice4 {
    /*
    [Difficult, don't spend too much time on it]

Write a program that can print out the common elements from each inner element of a 2D
array

Ex:
       int[][] arr {
              {4, 1, 24, 5},
              {24, 1, 5, 2},
              {4, 1, 5, 1}
       }


     */
    public static void main(String[] args) {
        int[][] arr = {
                {4, 1, 24, 5},
                {24, 1, 5, 2},
                {4, 1, 5, 1}
        };

        String common = "";

        for (int[] array : arr) { //array
            for (int element : array) { //elements
                int count = 0;

                for (int i = 0; i < arr.length; i++) {
                    for (int j = 0; i < arr.length; j++) {
                        if (element == arr[i][j]) {
                            count++;
                            break;
                        }
                        if (count >= 1) {
                            System.out.println(element);

                        }
                    }



                }
            }

        }

    }
}





