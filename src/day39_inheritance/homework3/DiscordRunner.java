package day39_inheritance.homework3;

import day39_inheritance.acess.a.Runner;

public class DiscordRunner {
    public static void main(String[] args) {

        Student obj1= new Student("Baz",53535);
        Admin obj2= new Admin("Baz",78878);
        DiscordUser obj3= new DiscordUser("user", "Baz",89999);

        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);

    }
}
