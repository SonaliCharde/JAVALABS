package MiscInterviewProblems;
import java.util.Scanner;

public class AdditionofBackwardDigits {
    public static void main(String[]args){
        int digit; int fact =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a digit to calculate sum of its backward digits");
        digit= sc.nextInt();
        int i=1;
        while (i<=digit) {
            fact = (fact + i);
            i++;
        }
            System.out.println(fact);




    }
}
