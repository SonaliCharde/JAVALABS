package Exceptions.ThrowThrows.CustomsException;

public class Hello {
    public static void main(String[] args)throws Exception {
        H h = new H();
        h.process();

    }
    static class H {
        public int process(){
//            int a = 10/0;
//            throw new NullPointerException("Enter correct divisor");
            int a = 10/0;
            return 0;
        }
    }
}
