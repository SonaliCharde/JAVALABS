package Strings;

public class Lab015 {
    public static void main(String[]args){
        char c= '\n'; // Next line
        char c1 = '\t'; //Next tab
        char c2 = '\b'; // Backlash -delete one character
        char c3 = '\r'; // Backlash -delete one word

        System.out.println("Sonali" + c3 + "Charde"); //will delete one word
        System.out.println("Sonali\tCharde"); // will print with tab space in between
        System.out.println("Pramo\"d");
        System.out.println("Pramo\'d");
    }
}
