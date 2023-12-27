package MiscInterviewProblems;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[]args){

        // Create a program that determines whether a given year is a leap year.
        // A leap year is divisible by 4,


        // but not by 100 unless it is also divisible by 400.
        // Use an if-else statement to make this determination.

        //1. Coding
        //2. User Input = int year =Year to be checked
        //3. Brute force Logic (year%4==0) && (year&100! =0) OR (year%400=0)
        //4. Logic correction

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year and I will tell you whether Leap or Not");
        int year = sc.nextInt();

        if ((year%4 == 0) && (year%100 != 0) ||(year%400 == 0)){
            System.out.println(year+" is a Leap Year");
        }
        else {
            System.out.println(year+ " is not a Leap Year");
            sc.close();
        }
    }
}
