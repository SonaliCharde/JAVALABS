package OOPS.Abstraction.Interface;

public class Son implements BaseFather1{
    public static void main(String[] args) {
        BaseFather1.Print1();

        Son son = new Son();
        son.Print();
        son.cash1K();
    }
    @Override
    public void cash1K() {
        System.out.println("I will give you cash of 1K to");
        //System.out.println("I will give you cash of 1K to"+super.Name);
    }


}
