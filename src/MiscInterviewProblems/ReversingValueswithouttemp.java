package MiscInterviewProblems;
import java.util.Scanner;

public class ReversingValueswithouttemp {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for x");
        int x = sc.nextInt();
        System.out.println("Enter the value for y");
        int y = sc.nextInt();

        //Write your code here
        x= x+y; //x= 30+20 =50
        y=x-y;  //y=50-20 = 30
        x=x-y;  //x=50-30 = 20

        System.out.println("Value for x is " +x);
        System.out.println("Value for y is " +y);

    }
}
