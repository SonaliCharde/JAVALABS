package Arrays;
import java.util.Scanner;

public class Lab105 {
    public static void main(String[]args){
        // Take input user Marks of 5 subjects and Print the marks

        Scanner sc= new Scanner(System.in);

        float[] marks =new float[5];

        System.out.println("Enter marks for Subject1");
        marks[0] = sc.nextFloat();
        System.out.println("Enter marks for Subject2");
        marks[1] = sc.nextFloat();
        System.out.println("Enter marks for Subject3");
        marks[2] = sc.nextFloat();
        System.out.println("Enter marks for Subject4");
        marks[3] = sc.nextFloat();
        System.out.println("Enter marks for Subject5");
        marks[4] = sc.nextFloat();

        for (int i =0; i< marks.length;i++){
            if (marks[i]<35){
                System.out.println("You have failed in this subject ");
                System.out.println("Your subject marks are = "+marks[i]);
                sc.close();
            }
        }
    }
}
