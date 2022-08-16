package day11_nested.homework;

public class Movie {
    /*
    The length of the movie will determine how much it costs.
declare and assign a variable for the duration of the movie
The length will be given as a decimal as hours.minutes

	duration of less than or equal to 0:
		Movies cannot be less than 0 minutes
	duration of more than 4:
		Movies cannot be more than 4 hours

	for all other duration uses the following values to display the price of the tickets

		duration 	--> price
		1.0 		--> 8.99
		1.5 		--> 10.50
		2.0 		--> 12.99
		2.5 		--> 14.50
		3, 3.5 or 4 --> 15.99



     */
    public static void main(String[] args) {

        double movieDuration =-1;
        double price=0;

        if (movieDuration >0 && movieDuration <= 4) {

            if (movieDuration == 1) {
                price = 8.99;
            } else if (movieDuration == 1.5) {
                price = 10.50;
            } else if (movieDuration == 2) {
                price = 12.99;
            } else if (movieDuration == 2.5) {
                price = 14.50;
            } else {
                price = 15.59;
            }
            System.out.println("Movie duration: " + movieDuration);
            System.out.println("Price: $" + price);

        }else {
            if (movieDuration < 0) {
                System.out.println("Movies cannot be shorter than 0 minutes");
            }else {
                System.out.println("Movies cannot be longer than 4 hours");
            }





        }

    }
}
