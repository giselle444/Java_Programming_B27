package day39_inheritance.acess.a;

public class Runner {
    public static void main(String[] args) {

        //Q: what did I inherit, what do I have access to
        //same package
        Condo condo = new Condo();
        condo.address= "1312 l";  //public
        condo.city="Chicago";//protected
        condo.state=" IL"; // default is inherited bc we're in same package

       // condo.zipcode= zipcode is private so we can't inherit


    }
}
