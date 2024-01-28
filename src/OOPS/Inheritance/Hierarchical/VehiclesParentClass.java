package OOPS.Inheritance.Hierarchical;

public class VehiclesParentClass {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.VehiclehasSpeed();
        Car c = new Car();
        c.VehiclehasSpeed();
        Truck t = new Truck();
        t.VehiclehasSpeed();
    }
}
