package OOPS.Abstraction;

public class Son extends BaseFather{
    @Override
    void Cash() {
        System.out.println("Son will get Fathers Cash of 1 Cr");
    }

    @Override
    void Plot() {
        System.out.println("Son will get Father's plot of 1 Acre");

    }

    @Override
    void Bunglow() {
        System.out.println("Son will get Fathers Bunglow");

    }
}

