package day04_variables;

public class CarDriver {
    /*declare and assign these variables with the most appropriate datatypes:
        driver name, car model, license number, license class, speed, is automatic

    create a summary of the information and print it. Be creative*/

    public static void main(String[] args) {
        String driverName="Giselle";
        String carModel="Toyota";
        int licenseNumber= 4_567_833;
        char licenseClass='B';
        int speed= 125;
        boolean isAutomatic= true;

         System.out.println(driverName + " drives a " + carModel );
        System.out.println("her license number is " + licenseNumber + " and class " +licenseClass );
        System.out.println("speed: " + speed + " and is automatic " + isAutomatic);

        //alternative solution
        String report= driverName + " drives a " + carModel +
                "\nher license number is " + licenseNumber + " and class " + licenseClass +
                "\nspeed " + speed + " and is automatic " + isAutomatic;











    }
}
