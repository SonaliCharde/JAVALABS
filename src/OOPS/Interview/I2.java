package OOPS.Interview;

public class I2 {
    public static void main(String[] args) {

        System.out.println(PP.a); //Yes as static
        foo foo= new foo();
        foo.m1();
        PP pp = new foo(); //Dynamic dispatch
        pp.m1();
        Rofl rofl = new foo();//Dynamic dispatch
        rofl.m1();
        rofl.say();
    }

}
interface PP{ //incomplete method
    int a = 10; //public static final
    void m1(); //Non static method
}

abstract class Rofl implements PP{ //Rofl is also incomplete
    abstract void say();
}
class foo extends Rofl{

    @Override
    public void m1() {
        System.out.println("m1");
    }

    @Override
    void say() {
        System.out.println("Say");
    }
}
