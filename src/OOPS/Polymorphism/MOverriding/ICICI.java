package OOPS.Polymorphism.MOverriding;

public class ICICI extends Bank{
    @Override
    void Interest(int i) {
        //return i;
        System.out.println("ROI for ICICI is "+i);

    }
}
