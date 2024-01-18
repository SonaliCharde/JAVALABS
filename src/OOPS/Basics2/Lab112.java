package OOPS.Basics2;

public class Lab112 {
    public static void main(String[] args) {
        //Way of calling  methods
        int s1 = Sum1(23,334,4);
        String s2 = Sum2("Sonali", "Charde");
        Double s3 = Sum3(3432,343432,343232,434324);
        Hello(); //Calling function
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println("-------------------------------");

    }
    static int Sum1(int a, int b, int c){
        return a+b+c;

    }
    static String Sum2(String a, String b){
        return a.concat(b);
    }
    static  Double Sum3(double a , double b, double c , double d){
        return a+b+c+d;
    }
    static void Hello(){
        System.out.println("Hello");
    }


}
