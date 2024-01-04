package Strings;

import java.io.PrintStream;

public class Lab008 {
    public static void main(String[]args){
        int number =9;
       System.out.printf("%d*1=%d*1", number, number);
        System.out.println();

       // We use printf for formatting purpose.
        String name = "Sonali"; //String is bunch of characters
        // Concate +
        System.out.println("Name is "+name);
        System.out.println();

        //Formatting String
        System.out.printf("Name is %s" ,name);
        System.out.println();

        float pi = 3.14159f;
        System.out.printf("Value of pi is %f",pi);
    }
}
