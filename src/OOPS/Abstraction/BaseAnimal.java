package OOPS.Abstraction;

public abstract class BaseAnimal {
    BaseAnimal(){}

    void m1(){ //Concrete method, complete
        System.out.println("I am m1()");
    }
    abstract void m2();

}
