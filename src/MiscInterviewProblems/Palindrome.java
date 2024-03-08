package MiscInterviewProblems;

import java.util.Locale;
import java.util.Scanner;

public class Palindrome {
public static boolean isPalindrome(String str){
    str = str.toLowerCase();
    for (int i=0; i<str.length();i++){
        char start = str.charAt(i);
        char end = str.charAt(str.length()-1-i);

        if ( start !=end){
            return false;
        }
    }
    return true;
}
public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter input string");
    String inputString = sc.next();

    if (isPalindrome(inputString)){
        System.out.println("Input string is a palindrome");
    }else {
        System.out.println("Input String is not a palindrome");
    }
}
}
