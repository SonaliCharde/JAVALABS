package Functions;

public class Lab117 {
    public static void main(String[]ref_name){
        System.out.println("Run fine!!!");

        int d = main(10);
        System.out.println(d);
        main("Pramod");

    }
    static void main(String a){
        System.out.println("JVM does not recognize me");
    }
    static int main(int a){
        return a+100;
    }
}
