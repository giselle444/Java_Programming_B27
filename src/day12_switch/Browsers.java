package day12_switch;

public class Browsers {
    public static void main(String[] args) {

        String browser = "chrome";
        String url = "www.google.com";

        switch (browser){
            case "chrome":
                System.out.println("Opening google in chrome");
                break;
            case "firefox":
                System.out.println("opening google in firefox");
                break;
            case "safari":
                System.out.println("Special set up or apple computers");
                System.out.println("opening in safari");
                break;

            default:
                System.out.println("Opening in chrome by default");

        }
    }
}
