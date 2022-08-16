package day04_variables;

public class Computer {
    /*
    declare and assign these variables with the most appropriate datatypes:
        brand, processor, ram memory, storage memory, has monitor, has wifi card, price, number of USB slots, has Bluetooth
        create a summary of the information and print it. Be creative

     */
    public static void main(String[] args) {
        String brand= "Dell";
        String processor= "Inter Core i5";
        int ramMemory= 16;
        int storageMemory= 64;
        boolean hasMonitor= true;
        boolean hasWifiCard= false;
        double price= 1200;
        int numberOfUSBSlots= 4;
        boolean hasBluetooth= true;

        System.out.println("\tComputer information: " + "\nBrand: " + brand);
        System.out.println(processor+ " with " + ramMemory + " GB ram and " + storageMemory + "GB storage memory");
        System.out.println("Has a monitor: " + hasMonitor + " has wifi card: " + hasWifiCard);
        System.out.println("Has the price of $ " + price + " with " + numberOfUSBSlots + " USB slots " +
                " and has bluetooth:" + hasBluetooth);








    }
}
