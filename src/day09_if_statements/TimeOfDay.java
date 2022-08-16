package day09_if_statements;

public class TimeOfDay {
    /*
    create an int value for the time of the day. Use a 24 hour format
    use the given time of day to display a message
    hint: use seperate if statements

	if the hours are from 6 - 11, print: Good morning
	if the hours are from 12 - 16, print: Good evening
	if the hours are from 17 - 23 or 0 - 5, print: Good night

     */
    public static void main(String[] args) {

        int timeOfDay= 12;

        if ( timeOfDay >= 6 && timeOfDay <= 11){
            System.out.println("Good morning");
        }else if (timeOfDay >=12 && timeOfDay<= 16){
                System.out.println("Good evening");
        } else if ((timeOfDay >=17 && timeOfDay<=23) || (timeOfDay >= 0 && timeOfDay <= 5)){
            System.out.println("Goodnight");
        }


    }
}
