package my_utils;

public class ArrayUtil {

    /*
    group of utility methods for arrays
    extra practices from 08/01 will be done here
     */


    /*
    Min Number
    create a method that will accept an int array and return the smallest number from the array
     */
    public static int min(int...arr) { //int [] arr IS THE SAME AS int...arr
        int min = arr[0];
        for (int each : arr) {
            if (each < min) {
                min = each;
            }
        }
        return min;

    }

    /*
    Max Number
    create a method that will accept an int array and return the biggest number fromt he array
     */
    public static int max(int...arr) {

        int max = arr[0];
        for (int each : arr) {
            if (each > max) {
                max = each;
            }

        }
        return max;
    }
    /*
    contains
    create a method that will acept an int array and int number. Check and return if the given number is in the array.
     */

    public static boolean contains (int []arr, int num){

        for (int each: arr){
            if(each==num){
                return true;
            }
        }


        return false;

    }
/*
IndexOf

create a method that will accept an int array and an int number. Find and return the index of the number in the array. If there is multiple occurrence return the first occurrence's index


 */
    public static int indexOf(int[]arr, int num){

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==num){ //comparing every number from the array with the num we are looking for
                return i;
            }
        }
        return -1;
    }
}


