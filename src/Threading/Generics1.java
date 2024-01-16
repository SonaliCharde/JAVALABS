package Threading;

public class Generics1 {

    public static <T> void temp(T a) //T is a generic name given to datatype
    {
        System.out.println(a);

    }
    public static void main(String[]args){
        temp(34);
        temp("Sonali");
        temp("45.23");
    }

}

