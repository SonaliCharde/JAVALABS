package MiscInterviewProblems;

public class SumofArrayElements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 545, 2121, 323242};
        System.out.println(arr.length);

        int sum = 0;
        int i;
        for (i = 0; i <= arr.length; i++) {
            sum = sum + arr[i];

            System.out.println("Sum of array elements is " + sum);
            System.out.println("Average of array elements is " + sum / arr.length);
        }
    }
}
