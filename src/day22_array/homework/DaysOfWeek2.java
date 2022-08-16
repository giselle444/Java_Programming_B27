package day22_array.homework;

import java.util.Arrays;
import java.util.Scanner;

public class DaysOfWeek2 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the number of the day of the week");
        int num= input.nextInt();

        String[] days={"Monday","Tuesday","Wednesday", "Thursday", "Friday","Saturday","Sunday"};

        days[0]="monday";
        days[1]="tuesday";
        days[2]="wednesday";
        days[3]="thursday";
        days[4]="friday";
        days[5]="saturday";
        days[6]="sunday";

        System.out.println(Arrays.toString(days));

    }
}
