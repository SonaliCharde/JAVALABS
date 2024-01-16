package Threading;

public class GenericsComaparable {
    public static <DT extends Comparable<DT>> DT maximumof(DT a, DT b, DT c) {

        //If Comparable is not used then only int and double can be compared
        //String cannot be used

        DT max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maximumof("Sonali","Tushar","Charde"));
        System.out.println(maximumof(1212,323,23));
        System.out.println(maximumof('A','B','C'));
        System.out.println(maximumof(23.34,32.67,34.433));
    }
}

