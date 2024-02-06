import java.util.Arrays;
import java.io.*;

public class Arr {
    public static void main(String[] args) {
        int[] ar1 = {6, 10, 5, 4, 9, 120, 4, 6, 10};

        int n = ar1.length;


        printDistinct(ar1,n);

}
static void printDistinct(int[] ar1, int n){

    for (int i = 0; i < n; i++) {
        for (int j = 0; i < i; j++) {
            if (ar1[i] == ar1[j]) {
                break;

            }if (i==j){
                System.out.println(ar1[i]+" ");

            }

        }
    }
}}





