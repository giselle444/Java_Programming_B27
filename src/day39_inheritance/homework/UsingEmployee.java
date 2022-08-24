package day39_inheritance.homework;

public class UsingEmployee {
    public static void main(String[] args) {


    /*
    Create objects of all three to see
    which variables and methods each object has access to
     */

        Employee obj1 = new Employee();

        Tester obj2= new Tester();

        Developer obj3= new Developer();

       obj2.bugsFound=true;
       obj2.name="Giselle";
       obj2.isFullTime=true;
       obj2.salary=120_000;
       obj2.work();
       obj2.test();
    }
}
