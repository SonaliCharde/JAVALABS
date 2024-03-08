package MiscInterviewProblems;
import java.util.Scanner;
public class PalindromeString2 {
    public static void main(String[] args) {
        String original, reverse = "";

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a original string");
        original = sc.nextLine();

        int lenght = original.length();

        for (int i =lenght-1; i>=0; i--){
            reverse = reverse+original.charAt(i);
        }
        System.out.println("Reverse String is "+reverse.toLowerCase());

        if (original.equals(reverse)){
            System.out.println("Input string is a Palindrome");
        }else {
            System.out.println("Input string is not a Palindrome");
        }

    }
}
