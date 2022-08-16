package day12_switch.homework;

public class SeasonFinder {
    /*
    Season Finder

    declare and assign a month number. Bases on the below data determine what
    season it is and what kind of clothes to wear. You can create your own expectations
    of what kind of clothes to wear based on the month

	12, 1, 2 	--> Winter
	3, 4, 5 	--> Spring
	6, 7, 8 	--> Summer
	9, 10, 11 	--> Fall

    Ex:
	2
	It is winter, so wear a winter coat, gloves and a hat

     */
    public static void main(String[] args) {

        int monthNumber = 11;
        String season="";
        String clothes="";

        switch (monthNumber){
            case 12:
            case 1:
            case 2:
                season= "winter";
                clothes= "hat, scarf, coat";
                break;
            case 3:
            case 4:
            case 5:
                season = "spring";
                clothes= "raincoat, t-shirt, sneakers";
                break;
            case 6:
            case 7:
            case 8:
                season= "summer";
                clothes= "shorts, sandals, tank tops";
                break;
            case 9:
            case 10:
            case 11:
                season = "fall";
                clothes= "boots, leggings, sweaters";
                break;




        }
        System.out.println("It is " + season + " so wear " + clothes);



    }


}
