package OOPS.Polymorphism.MOverriding;

public class RCBank {
    public static void main(String[] args) {
        ICICI icici = new ICICI();
        icici.Interest(10);

        BOI boi = new BOI();
        boi.Interest(9);

    }
}
