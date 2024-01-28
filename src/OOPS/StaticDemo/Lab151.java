package OOPS.StaticDemo;

public class Lab151 {
    public static void main(String[] args) {
        P01 p01 =new P01();

        //SIB- Static initialisation block will be called only once even if objects are created
        P01 p011 = new P01();

        p01.m1(); //Non static method is called by creating ref variable of object
        P01.m2(); //Static method can be called directly by class name

        P01 p012 = null;
        //p012.m1(); //Null pointer exception
        p012.m2();

    }
}
class P01{
    static {
        System.out.println("SIB");
    }

    {
        System.out.println("IIB");
    }
    int a = 10;
    static int b = 20;
    void m1(){
        System.out.println("m1");
        System.out.println(a);
        System.out.println(b);
    }
    static void m2(){
        //System.out.println(a); //Static functions cannot have a instance variable
        System.out.println(b); //b is static variable
    }
}
