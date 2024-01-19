package OOPS.InheritanceAndCallingClasses.Hierarchical;

public class Vehicle {
    Vehicle(){
        System.out.println("Default Constructor-Vehicle");
    }
    void VehiclehasSpeed(){
        System.out.println("Yeah from "+getClass().getSimpleName().toUpperCase());
    }
}
