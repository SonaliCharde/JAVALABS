package BreakandContinue;

public class Lab085 {
    public static void main(String[]args){

        //Continue if true condition

        for (int i=1; i<=10; i++){
            System.out.println(i);
            if (i==5) continue; // when i==5 then it will continue and not print the last statement
            System.out.println("After");
        }

    }
}
