package BreakandContinue;

public class Lab084 {
    public static void main(String[]args){
        for (int i=0; i<=10; i++){
            System.out.println(i);
            if (i%2==0) break;

        }
        System.out.println("End");

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if(i%2 == 0){
                break;
            }
        }
    }
}
