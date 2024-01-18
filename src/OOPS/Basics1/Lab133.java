package OOPS.Basics1;

public class Lab133 {
    public static void main(String[] args) {
        //Immutable= that cannot be changed

        String s1 = "Sonali";
        String s2 = new String("Sonali");

        //Mutable = that can be changed
        StringBuilder sb = new StringBuilder("Sonali");
        sb.append("Charde");
        System.out.println(sb);

    }
}
