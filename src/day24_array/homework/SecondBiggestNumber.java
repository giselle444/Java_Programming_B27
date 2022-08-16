package day24_array.homework;

import java.util.Arrays;

public class SecondBiggestNumber {

    /*
    Second Biggest Number

Given an Array of numbers. Find and print the 2nd biggest number.

Note the 2nd biggest should be unique meaning it should be different from the max number

Example:
	Input:
		[4,3,1,4,5,2,4,8,4,8]
	Output:
		5


     */

    public static void main(String[] args) {

        int [] arr= {4,3,1,4,5,2,4,8,4,8};
        Arrays.sort(arr); //always use arrays with methods
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[arr.length-3]);






    }
}
