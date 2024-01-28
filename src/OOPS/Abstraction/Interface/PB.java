package OOPS.Abstraction.Interface;

public class PB implements I {
    public static void main(String[] args) {
        PB pb = new PB();
        pb.test();
        pb.test1();
    }
    @Override
    public void test() {
        System.out.println("test");
    }

    @Override
    public void test1() {
        System.out.println("test1");

    }
}
interface I{
    void test();
    void test1();
}
