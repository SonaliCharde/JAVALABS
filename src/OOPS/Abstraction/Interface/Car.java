package OOPS.Abstraction.Interface;

public class Car implements Break, Engine{
    void start(){
        System.out.println("Starting the car");
        Starts();
        breaks();

    }

    @Override
    public void breaks() {
        System.out.println("Breaks are fine");
    }

    @Override
    public void Starts() {
        System.out.println("started engine");

    }
}
