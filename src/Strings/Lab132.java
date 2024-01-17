package Strings;

public class Lab132 {
    public static void main(String[] args) {
        String s1 = "Sonali";
        String s2 = new String("Sonali");
        String s3 = new String("sonali");
        System.out.println(s1==s2); //false because == in String will check for the reference and not values
        System.out.println(s1.equals(s2)); //true as equals() will check for the values

        System.out.println(s1.equalsIgnoreCase(s3)); // Ignore the capital and small letters in both strings.
    }
}
