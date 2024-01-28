package OOPS.InnerClasses;

public class Lab152 {
    public static void main(String[] args) {
        Car car = new Car("Ferarri");

        //OC.IC Ref =OCRef.newIC();
        //Syntax to access the inner classes
        Car.Engine engine = car.new Engine("4000CC");
        car.drive();
        engine.start();


    }}


class Car{
    String make; // Instance variable

    //Parametarised Constructor
    public Car(String make){
        this.make = make;
    }
    //Method
     void drive(){
        System.out.println("You can drive a car");
    }
    public class Engine{
        String horsepower; //Instance variables

        //Parametarised constructor
        public Engine(String horsepower){
            this.horsepower = horsepower;
        }

        //Method
        void start(){
            System.out.println("Engine is started");
        }
    }

}
