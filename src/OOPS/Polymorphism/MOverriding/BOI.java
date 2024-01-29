package OOPS.Polymorphism.MOverriding;

public class BOI extends Bank{
    @Override
    void Interest(int i) {
        System.out.println("BOI interest is "+i);
    }
}
