package day05_arithmetic;

public class Pizza {
    public static void main(String[] args) {
      String type = "Cheese";
      int pizzaSlices = 12;
      int people = 3;
      int slicesPerPerson = pizzaSlices / people;
      int leftOverSlices = pizzaSlices % people;

        System.out.println(people + " people are going to eat the " + type + " pizza. Every person will get " + slicesPerPerson +
                "  slices and there will be " + leftOverSlices + " left over.");








    }
}
