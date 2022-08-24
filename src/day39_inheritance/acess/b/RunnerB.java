package day39_inheritance.acess.b;

public class RunnerB {
    public static void main(String[] args) {

        //Q: What does TownHouse inherit from House?

        //in different packages

        TownHouse house= new TownHouse();
        house.address=" 123134 road";
        //house.city="Fairfax"; not accessible outside the package
        //house.state; state is efault, only acessible in the same package
        //house.zipcode= sipcode is private, only accessible in same class
    }
}
