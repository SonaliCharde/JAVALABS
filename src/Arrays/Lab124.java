package Arrays;
import java.util.Scanner;

public class Lab124 {
    public static void main(String[]args) {
        //1,2,3,4,5

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size in n");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements");
        int i;
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        for (i=0; i<n;i++){
            System.out.println(arr[i]);
        }
        sc.close();

    }
}
