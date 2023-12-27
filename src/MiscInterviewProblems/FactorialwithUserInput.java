package MiscInterviewProblems;
import java.util.Scanner;

public class FactorialwithUserInput {
    public static void main(String[]args){
        // Multiplying backward digits
        // Digit = 5 then factorial will be 5*4*3*2*1

        //Input = user entered number 5, Fact=1
        //Logic = Iterate and iterated number*fact

        int fact=1; int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find factorial");
        n = sc.nextInt();

        for (int i=1;i<=n;i++){
            fact = (fact*i);
            //System.out.println("Factorial of a given number is "+fact);
        }
        System.out.println(fact);

    }
}
