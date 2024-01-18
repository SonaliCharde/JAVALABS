package OOPS.Inheritance.Hierarchical;

public class B extends A {
 String a = "10lakhs";

    public static void main(String[] args) {
        String a = "10Lakhs";
        B b = new B();
        b.Wealth();
        b.House();
    }
    public void BWealth(){
        System.out.println(this.a);
    }
}
