package Threading;

public class GenericsDemo {
    public static <T1, T2, T3> void temp(T1 x, T2 y, T3 z){
        System.out.println("This is value for x  ->"+x );
        System.out.println("This is value for y  ->"+y );
        System.out.println("This is value for z  ->"+z );
    }
    public static void main(String[]args){
        temp("Sonali","Tushar", "Charde");
        temp(4,07,1990);
        temp(7249,455,607);
    }

}

