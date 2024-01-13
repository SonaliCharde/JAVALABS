package MiscInterviewProblems;
import java.util.Scanner;

public class PrimeNumberFinder {
    public static void main(String[]args){
        // Prime Number Condition num%i(i -> 2 to num) == 0 -> x
        //  0 -> X
        // 1 -> X
        // 2 -> prime?
        // 3 -> ?
        // 4 -> ?

        int i = 0;
        int flag = 0;
        int m = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        //        17 -> 2 to 17/2 -> num%i == 0 ->False - not a prime

        m=n/2;
        if(n==0 || n==1){
            System.out.println("Entererd number is not a prime-> " +n);
        }
        else {
            for (i=0; i<=m;i++){
                if (n%i==0){
                    System.out.println("Not a prime");
                    flag=1;
                    break;
                }
            }
        }
        if (flag==0){
            System.out.println("Prime number "+n);
        }
    }
}
