package day27_methods;

import javax.crypto.spec.PSource;

public class Car {
    /*
    unlock car
    open door
    sit down & start
    check mirrors
    seatbelt
    adjust seatbelt
    put to drive and go


     */

    public  static  void unlock(){
        System.out.println("locking car");
    }
    public  static void openDoor(){
        System.out.println("Opening the door");
    }
    public static void sitAndStart(){
        System.out.println("Sitting down in seat");
        System.out.println("Then insert the key");
        System.out.println("start the car");
    }
    public static void checkMirrors(){
        System.out.println("checking left mirror");
        System.out.println("checking rear view mirror");
        System.out.println("checking right mirror");
    }
    public static void putOnSeatbelt(){
        System.out.println("putting on seatbelt");
    }
    public static void drive(){
        System.out.println("Putting into drive");
        System.out.println("pressing on accelerator");
    }

    public static void main(String[] args) {
        unlock();
        openDoor();
        sitAndStart();
        checkMirrors();
        putOnSeatbelt();
        drive();
    }

}
