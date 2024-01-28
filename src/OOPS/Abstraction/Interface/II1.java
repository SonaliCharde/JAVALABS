package OOPS.Abstraction.Interface;

public class II1 {
    public static void main(String[] args) {
        /* Hello hello = new Hello(); */


        Hello1 hello1 = new Hello1();
        hello1.hello();
        hello1.say();

        II ii = new II() {
            @Override
            public void say() {

            }
        };
        ii.hello();
        ii.say();


    }
}



interface II {
    void say();

    default void hello() {
        System.out.println("Hello default");
    }
}
    interface P {
    }

    class Hello1 implements II{

        @Override
        public void say() {
            System.out.println("Say");
        }

        @Override
        public void hello() {
            System.out.println("Hello of hello");
        }
    }





