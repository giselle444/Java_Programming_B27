package day28_methods;

public class DaysInWeek {
    public static void main(String[] args) {
        System.out.println(dayInWeek(4));
        System.out.println(dayInWeek(7));

        switch (dayInWeek(1)){
            case "Mon":
                System.out.println("have full day of java");
                break;
            case "Tue":
            case "Thur":
                System.out.println("Half java, half soft skills");
            case "Wed":
                System.out.println("Office hours");
            case "Sat":
            case "Sun":
                System.out.println("Off");
        }
    }

    //1- Mon..7-Sun

    public static String dayInWeek(int day){

            String[] days= {"Mon","Tue","wed","Thur","fri","sat","sun"};
            return days[day-1]; //convert the number to index
        }


    }

