package OOPS.Abstraction.Interface;

public class Car implements Break,Engine{
    void start(){
        System.out.println("Starting the car");
        StartEngine();
        breaks();
    }

    @Override
    public void breaks() {

    }

    @Override
    public void StartEngine() {

    }
}
