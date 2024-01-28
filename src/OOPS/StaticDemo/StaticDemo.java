package OOPS.StaticDemo;

public class StaticDemo {
    //Static variable

    public static String CollegeName = "The Testing Academy";

    //Non-Static Variable - Local or instance

    public int version = 3; //Instance variable

    //Static method
    public static void printName(){
        System.out.println("Name is "+CollegeName);
       // System.out.println("Version is "+version); - Cannot have instance variable inside a static method

    }
    public void printversion(){
        System.out.println("Name is "+CollegeName);
        System.out.println("Version is "+version);
    }

}
