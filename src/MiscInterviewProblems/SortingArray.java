package MiscInterviewProblems;
import java.util.Arrays;
public class SortingArray {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 1223232;
        arr[1] = 23;
        arr[2] = 87;
        arr[3] = 99;
        arr[4] = 123;
        System.out.println("Array length is " + arr.length);
        System.out.println(arr[0]);

        Arrays.sort(arr);

        System.out.println("Lowest element in array is " + arr[0]);
        System.out.println("Highest element in array is " + arr[arr.length - 1]);

        System.out.println("Sort ascending");
        for (int i=0;i<=arr.length;i++){
            System.out.println(arr[i]);
        }

        System.out.println("Sort descending");
        for (int i = 5; i >= 0; i--) {
            System.out.println(arr[i]);


        }
    }
}
