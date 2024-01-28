package OOPS.Interview;

public class I1 {
    public static void main(String[] args) {
        System.out.println(H.a); //Calling static variable in interface

    }
}
interface H{
    //Only public static final variables are in interface

   public static final int a = 10;
    int b = 20;
    void m1(); //Functions are non static
}
class Sonali implements H{

    @Override
    public void m1() {
        System.out.println("m1");
    }
}
