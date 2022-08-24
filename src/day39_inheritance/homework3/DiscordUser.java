package day39_inheritance.homework3;

public class DiscordUser {
  /*
    - create variables:
    role, name, id

    - create constructor to initialize the variables

    - create a toString() method

   */

    String role;
    String name;
    int iD;

    public DiscordUser(String role, String name, int iD) {
        this.role = role;
        this.name = name;
        this.iD = iD;
    }

    @Override
    public String toString() {
        return "DiscordUser{" +
                "role='" + role + '\'' +
                ", name='" + name + '\'' +
                ", iD=" + iD +
                '}';
    }
}
