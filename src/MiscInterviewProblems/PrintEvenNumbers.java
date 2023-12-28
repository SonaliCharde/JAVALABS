package MiscInterviewProblems;

public class PrintEvenNumbers {
    public static void main(String[]args){
        // Method 1
        int i;
        for (i=0; i<=100; i++){
            if (i%2==0){
                System.out.println(i);
            }
        }

        //Method2
        int j;
        for (j=0;j<=100;j=j+2 ){
            System.out.println(j);
        }

        //Mathod3
        int a;
        for (a=0; a<=100; a++){
            if (a%2==0){
                System.out.println(a);
                continue;
            }

        }
    }
}
