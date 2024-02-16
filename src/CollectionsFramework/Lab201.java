package CollectionsFramework;

public class Lab201 {
    public static void main(String[] args) {
        // Java- non generic

        temp("Sonali");
        temp(123);

        printfunc("Sonali", 123);
        printfunc(123, 345);
    }
    public static <T> void temp(T x){
        System.out.println(x);
    }
    public static <T> void printfunc( T a, T b){
        System.out.println(a);
        System.out.println(b);
        // Proper logic compare the a and b
    }
}
