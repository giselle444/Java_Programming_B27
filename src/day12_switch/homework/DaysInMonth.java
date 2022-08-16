package day12_switch.homework;

public class DaysInMonth {
    /*
    Write a program that will accept a month name and outputs how many days are in that month

    data:

    February: 28 days
    April, June, September, November: 30 days
    January, March, May, July, August, October, December: 31 days
     */
    public static void main(String[] args) {

        String month="February";
        int daysInMonth=0;

        switch (month){
            case "February":
               daysInMonth= 28;
               break;
            case "April":
            case "June":
            case "September":
            case "November":
                daysInMonth=30;
                break;
            case "January":
            case "March":
            case "May":
            case "July":
            case "August":
            case "October":
            case "December":
                daysInMonth=31;





        }
        System.out.println("The month of " + month + " has " +daysInMonth + " days.");


    }
}
