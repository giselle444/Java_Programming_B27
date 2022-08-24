package day39_inheritance.homework;

public class Employee {
    /*
    Create a Employee class

	- create variables:
		name, is full time, salary

	- create method:
		work()
			Example output: prints $name is working

     */

    public String name;
   public boolean isFullTime;
   public int salary;


    public void work(){
        System.out.println( name + "is working");
    }

}
