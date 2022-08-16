package ConstructorHwk;

public class FoodWithConstructor {
    public static void main(String[] args) {
        Food newFood= new Food("Kabob",8,3,24);

        newFood.calculatePrice();
        System.out.println(newFood);
    }
}
