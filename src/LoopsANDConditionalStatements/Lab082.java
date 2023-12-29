package LoopsANDConditionalStatements;

public class Lab082 {
    public static void main(String[]args){

        // for( A ;B ; C)
        // A -> Initialization -> JVM What variable, where you are starting point
        // B - Condition -> When you want this to stop. -> true, false
        // C ->  Increment / Decrement

        // Print the Odd number in between the 1 to 50.
        // If Else

        for (int i= 0; i<=50; i++){
            if (i % 2 != 0) {
                System.out.println(i + "- Odd");
            } else {
                System.out.println(i+ "- Even");
            }
        }
    }
}
