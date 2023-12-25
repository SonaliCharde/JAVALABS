package IFELSEandLOOPS;

import java.util.Scanner;

public class ifelse1 {
    public static void main (String[]args){
//        if (true){
//            System.out.println("True");
//        }else {
//            System.out.println("False");
//      }





        // What If  - Number -> > 20, < 20 , < 10 ->

        // If, else if , else
        int i;
        Scanner in = new Scanner (System.in);
        System.out.println("Input value for i");
        i= in.nextInt();
        if (i>20){
            System.out.println("Print >20");
        } else if (i<20&&i>10) {
            System.out.println("Print <20");
        } else if (i<10 && i>=1) {
            System.out.println("Print <10");
        }
        else {
            System.out.println("out of range");
        }
    }
}
