package day04_variables;

public class Employee {
    /*
    declare and assign these variables with the most appropriate datatypes:

        - first name, last name, company name, job title, suite(char), employee id, number of PTO, salary, is full time

    declare new variables and use concatenation from previous variables to set their values
        - full name (first and last name)
        - email (first name + employee id @ company name.com)
        - benefits (salary, number of PTO and add "work from home")

    create a summary of the information and print it. Be creative
        Example output: Employment information for James Bond. Secret Agent for MI6, based in suite C.
        Mr. Bond is full time: true. Contact Mr. Bond at James7@MI6.com. Current benefits include $1000000 salary a year,
         20 PTO days and work from home.
     */
    public static void main(String[] args) {
        String firstName= "Sofia";
        String lastName= "Warren";
        String companyName= "Bank of America";
        String jobTitle= "Bank Teller";
        char suite='C';
        int employeeId= 3458700;
        int numberOfPTO= 12;
        double salary=45000;
        boolean isFullTime=true;
        System.out.println("\t Employment information for " +firstName + ' ' +lastName + ":" );
        System.out.println(jobTitle + " for " + companyName+ ", based in suite " + suite + ", employee ID:" + employeeId);
        System.out.println("Current benefits include $"+salary+ " yearly salary and "+ numberOfPTO+" days of PTO.");
        System.out.println("Sofia is full time:"+isFullTime);





    }
}
