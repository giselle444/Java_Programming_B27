package day32_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class EasyData {
    /*
    getDaysOfWeek will return and ArrayList of Strings with all thr days of the week
     */

    public static ArrayList<String> getDaysOfWeek(){
        return new ArrayList<>(Arrays.asList("Monday", "Tuesday", "wednesday","thursday","friday","saturday","sunday"));


    }
    public static ArrayList<Integer> getRandomNumbers(int limit){
        Random random= new Random(); //reasearch about this class, look at documentation
        ArrayList<Integer> list= new ArrayList<>();
        for (int i = 0; i < limit; i++) {
            list.add(random.nextInt(1000)); //0 to 1000

        }
        return list;
    }
}
