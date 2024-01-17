package Strings;

public class Lab136 {
    public static void main(String[] args) {
        // If something is Thread Safe, we avoid!
        // StringBuffer vs StringBuilder

        //String created in Heap area
        StringBuilder stringBuilder = new StringBuilder("Pramod");

        stringBuilder.reverse();
        System.out.println(stringBuilder);

        //String created in String pool area
        String Name = "Sonali";
        StringBuilder name = new StringBuilder();
        name.append(Name);
        name.reverse();
        System.out.println(name);

    }
}
