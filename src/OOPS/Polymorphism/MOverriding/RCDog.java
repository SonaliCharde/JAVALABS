package OOPS.Polymorphism.MOverriding;

public class RCDog {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();

        hound h = new hound();
        h.bark();

        Dog dg = new hound(); //Dynamic dispatch OR Runtime polymorphism
        dg.bark();
    }
}
