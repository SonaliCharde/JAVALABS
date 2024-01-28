package WrapperClasses;

public class Lab160 {
    public static void main(String[] args) {
        int x = 123; //Primitive
        //String st1 = x; //Not possible
        String st1 = x+"";

        //Functions provided by wrapper classes
        String st2 = String.valueOf(x);
        System.out.println(st2);
    }
}
