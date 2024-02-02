package Exceptions.ThrowThrows.CustomsException;

public class Lab170 {
    public static void main(String[] args)throws Exception {
    extracted(0);
    throw new Exception("Please read the error message carefully and action");
    }
    private static void extracted(int b){
//        int a;
//        if (b==0) {
//            throw new ArithmeticException("B cannot be zero");
//        }else {
//            a = 10/b;
//        }
//        System.out.println(a);

        //In web automation if a==0, throw an exception and exit program

        try {
            int a =10/b;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

}
