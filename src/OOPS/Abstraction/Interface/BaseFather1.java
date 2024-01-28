package OOPS.Abstraction.Interface;

public interface BaseFather1 {

    String Name = "Sonali";
    void cash1K();

    default void Print(){
        System.out.println("I am Default method");
    }
    static void Print1(){
        System.out.println("I am Static method");
    }
}

