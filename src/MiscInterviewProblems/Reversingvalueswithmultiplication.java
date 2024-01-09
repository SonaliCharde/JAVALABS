package MiscInterviewProblems;
import java.util.Scanner;

public class Reversingvalueswithmultiplication {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("x is"); //x= 30
        int x = sc.nextInt();
        System.out.println("y is"); //y = 20
        int y = sc.nextInt();

        //Write your code here

        x= x*y;         //x= 30*20 = 600
        y = x/y;        //y = 600/20 = 30
        x = x/y;        //x = 600/30 = 20

        System.out.println(x);
        System.out.println(y);

    }
}
