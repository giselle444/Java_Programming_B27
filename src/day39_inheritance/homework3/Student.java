package day39_inheritance.homework3;

public class Student extends DiscordUser {

    /*
    Create a class Student

    - Student class inherits DiscordUser class

    - create constructor to call parent constructor and
    set up variables (role - Student, name, id)

    - create method:
        sendMessage()
            Example output: prints Sending message to class chat
---------------------------------------------------------------------

     */
    public Student( String name, int iD) {
        super("student", name, iD);
    }

    public void sendMessage(){
        System.out.println("Sending Message to class chat ");
    }

}
