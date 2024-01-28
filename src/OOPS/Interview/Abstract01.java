package OOPS.Interview;

public class Abstract01
{

}
abstract class person01{
    abstract void say();
    abstract void say2();
    void eat(){
        System.out.println("Hello eat from person");
    }
}
abstract class student01 extends person01{

}
class Sonali1 extends person01{

    @Override
    void say() {

    }

    @Override
    void say2() {

    }
}
