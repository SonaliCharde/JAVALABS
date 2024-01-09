package MiscInterviewProblems;
import java.util.Scanner;

public class Reversingvalueswithtemp {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x"); //x=30
        int x=sc.nextInt();
        System.out.println("Enter the value of y"); //y=20
        int y =sc.nextInt();

        //Write your code here
        int temp = x; //temp =30
        x=y;          //x = 20
        y=temp;       //y = 30
        System.out.println("Value of x is "+x);
        System.out.println("Value of y is "+y);


    }
}
