package day12_switch;

public class SoccerGame {
    /*
      declare and assign a minutes variable
    use the minutes value to determine how much time is left in the soccer game

    use these ranges to determine the outputs:

	- any number less than 0 and more than 90 are not valid:

		when the minutes is less than 0:
			print: minutes cannot be a negative number
		when the minutes is more than 90:
			print: games cannot be longer than 90 minutes

	- when the minutes are between 90 - 75  75-90
		print: just getting started

	- when the minutes are between 74 - 60  60-74
		print: players are doing their best

	- when the minutes are between 59 - 30   30-59
		print: middle of the game is going great

	- when the minutes are between 29 - 0 0-29
		print: the end of the same is approaching
     */

    public static void main(String[] args) {

        int minutes = 90;

        if (minutes >= 0 && minutes <= 90) {
            //valid time
            if (minutes >=75){
                System.out.println("Just getting started");
            }else if (minutes >= 60){
                System.out.println("Players are doing their best");
            }else if(minutes >= 30){
                System.out.println("Middle of the game is going strong");
            }else{
                System.out.println("The end of the game is approaching");
            }


        } else {
            if (minutes < 0){
                System.out.println("Minutes cannot be a negative number");
        }else{
                System.out.println("games cannot be longer than 90m minutes");
            }
            System.out.println(minutes + " is not a valid time");

            //ternary: System.out.println(minutes <0 ? "minutes cannot be a negative number" : "games cannot be longer than 90 mins");

        }
    }

}
