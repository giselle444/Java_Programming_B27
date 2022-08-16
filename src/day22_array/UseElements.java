package day22_array;

import java.util.Arrays;

public class UseElements {
    public static void main(String[] args) {

        int[] nums ={4,5,12};
        System.out.println(nums.length);
        System.out.println(Arrays.toString(nums));

        System.out.println(nums[0] + nums[1]); //int +int-->9


        String[]strs={"Hello", "World", "java","code"};
        System.out.println(strs.length); //how many elements in array
        System.out.println(strs[2]);
        System.out.println(strs[2]+strs[3]); //String + String
        System.out.println(strs[0].length()); //String method length() --> tell the number of characters in the string;5

        System.out.println(strs[1].charAt(strs[1].length()-1)); //last index of the element at index1
        String s= strs[3];//assigning the value of the 3rd index of the array into a new string variable s




    }
}
