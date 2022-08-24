package day39_inheritance.acess.b;

import day39_inheritance.acess.a.House;

public class TownHouse extends House {
    public static void main(String[] args) {

        //Q: What does TownHouse inherit from House?

        //in different packages

        TownHouse house = new TownHouse();
        house.address = " 123134 road";
        house.city = "Fairfax";
        //did I inherit the city variable? yes
        //house.state;  state is efault, only acessible in the same package
         // house.zipcode; sipcode is private, only accessible in same class

    }
}
