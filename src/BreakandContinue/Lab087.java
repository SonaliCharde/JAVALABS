package BreakandContinue;

public class Lab087 {
    public static void main(String[]args){

        //Printing Even and odd numbers
        for(int i=1; i<=10;i++){
            if (i%2==0){
                System.out.println("Printing even number "+i);
                continue;
            }
            System.out.println("Printing odd Number "+i);
        }
    }
}
