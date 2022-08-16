package day29_methods.homework;

import java.util.Arrays;

public class MinNumber {
    /*Min Number

    create a method that will accept an int array and return the smallest number from the array


*/

    public static void main(String[] args) {
        System.out.println(smallestNumber(5,3,5,67,2));
        System.out.println(biggestNumber(5,3,5,67,2));
        System.out.println(numInTheArray(3,4,5,6,8,9,3)); //true
        System.out.println(indexNum(6,4,6,3,6,8));
      //  String[]a=arr={"my","my","name","is"};
      //  System.out.println(Arrays.toString(a));
    }
    public static int smallestNumber (int ... min){
        Arrays.sort(min);
        return min[0];
    }

    /*
       /*Max Number

    create a method that will accept an int array and return the biggest number from the array


*/


     public static  int biggestNumber (int...max){

         Arrays.sort(max);
         return max[max.length-1];
     }
     /*

     contains

create a method that will accept an int array and an int number. Check and return if the given number is in the array.

      */

    public  static  boolean numInTheArray(int num, int...arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==num){
                return true;
            }
        }
        return false;
    }
    /*
IndexOf

create a method that will accept an int array and an int number. Find and return the index of the number in the array. If there is multiple occurrence return the first occurrence's index



     */

    public static  int indexNum(int num, int...arr){
        int a =0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==num){
                a=i;
                return i;
            }

        }
        return a;


    }
    /*
    Add Element

create a method that will accept a String array and a String element. Add the given element value into the end of the array.
 Do not replace the last index of the given array, but instead create a new array with a bigger size to fit all the original elements plus the new one

     */

    public static String [] arr(String str1, String[]str){
        String[] arr= new String[str.length+1];
        for (int i = 0; i < str.length; i++) {
            arr[i]=str[i];
            
        }
        arr[arr.length-1]=str1;
       return arr;
        
    }
}
