package day23_array.homework;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    /*
    Reverse Array

	Write a program that will reverse the order of any given array
		Ex:
		Input:
			[1, 2, 3, 4, 5]
		Output:
			[5, 4, 3, 2, 1]


     */
    public static void main(String[] args) {

      Scanner input= new Scanner(System.in);
        System.out.println("Enter your input");
        int size= input.nextInt();

        int[] nums= new int[size];
        System.out.println(Arrays.toString(nums));


        for (int j = 0; j < nums.length; j++) {
            System.out.println("enter number");
            nums[j]= input.nextInt();

        }
        int[] numsReverse= new int[nums.length];
        int j=0;
        for (int i = nums.length-1; i >=0 ; i--) {
            numsReverse[j++] = nums[i];

        }
        System.out.println(Arrays.toString(numsReverse));



        }






    }

