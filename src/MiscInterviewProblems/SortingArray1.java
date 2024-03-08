package MiscInterviewProblems;

import java.util.Arrays;

public class SortingArray1 {
    public static void main(String[] args) {
        int[] ar1 = new int[6];
        ar1[0] = 100;
        ar1[1] = 1;
        ar1[2] = 10;
        ar1[3] = 1000;
        ar1[4] = 10000;
        ar1[5] = 100000;

        System.out.println(ar1.length);
        System.out.println(ar1[0]);

        System.out.println("Lowest element in an array is " + ar1[0]);
        System.out.println("Biggest element in an array is "+ ar1[5]);

        Arrays.sort(ar1);
        System.out.println("Sort ascending");
        for (int i=0;i<=ar1.length;i++){
            System.out.println(ar1[i]);
        }

        System.out.println("Sort descending");
        for (int i = ar1.length; i >= 0; i--) {
            System.out.println(ar1[i]);


        }
    }
}
