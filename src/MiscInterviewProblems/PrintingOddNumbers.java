package MiscInterviewProblems;

public class PrintingOddNumbers {
    public static void main(String []args){
        System.out.println("Below is the list of odd numbers");
        int i;
        for(i=0; i<=100;i++){
            if (i%2 ==0) {
                continue;
            }

            System.out.println(i);
        }

    }
}
