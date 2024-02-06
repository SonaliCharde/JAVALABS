package MiscInterviewProblems;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String and I will check if Palindrome or not");
        String UserInput = sc.next();



        UserInput = UserInput.toLowerCase();
        boolean result = isPalindrome(UserInput);
        if (result) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }

    static boolean isPalindrome(String UserInput) {

        String Original = UserInput; //Malyalam and Sonali and level
        StringBuilder sb = new StringBuilder(UserInput);
        //sb.append(Original);
        String Reversed = sb.reverse().toString();
        return Original.equalsIgnoreCase(Reversed);



    }}


