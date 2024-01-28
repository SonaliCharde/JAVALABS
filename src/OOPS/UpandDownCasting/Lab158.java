package OOPS.UpandDownCasting;

public class Lab158 {
    public static void main(String[] args) {
//        Parent parent = new Parent();
//        child child = new child();
//        parent = child; //possible
//        //child == parent; //No possible

        //Upcasting
        Hello hello = new Child2();

        //Downcasting
        Child2 child2 = (Child2) hello;

    }
}
//Upcasting and Downcasting in class
class Parent{}
class child extends Parent{}
class Hello{}
class Child2 extends Hello{}
