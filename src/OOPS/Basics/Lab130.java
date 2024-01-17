package OOPS.Basics;

public class Lab130 {
    public static void main(String[] args) {
        String name = "Pramod"; // Created in String pool area
        String name2 = new String("Pramod"); //Created in heap/object area

        name = "Sonali";
         String st1 = "Hello";
         st1 = st1.concat(" Charde"); //Concatenation of strings
        System.out.println(st1);
    }
}
