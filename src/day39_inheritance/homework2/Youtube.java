package day39_inheritance.homework2;

public class Youtube extends App{


 /*   Create a class Youtube

    - Youtube class inherits App class

    - create constructor to call parent constructor and set up variables
    (name and version)

    - create method:
    watchVideo()
    Example output: prints Watching java tutorial

  */
 public Youtube(String name, double version) {
     super(name, version);
 }

 public void watchVideo(){
     System.out.println("Watching Java tutorial");
 }


}
