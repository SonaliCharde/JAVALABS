package OOPS.StaticDemo;

public class Lab150 {
    public static void main(String[] args) {
//
//        //Calling static methods and variables
//        System.out.println(StaticDemo.CollegeName);
//        StaticDemo.printName();
        StaticDemo.CollegeName="TTA";

        //Calling non static methods
        StaticDemo staticDemo = new StaticDemo();
        staticDemo.version=199;
        staticDemo.printversion();



        StaticDemo staticDemo1 = new StaticDemo();
        staticDemo1.version=299;
        staticDemo1.printversion();
    }
}
