package MiscInterviewProblems;
import java.util.Arrays;

public class Largestelementinarray {
    public static void main(String[]args){
        int[] arr = {1,2,3,4,545,2121,323242,43435435,5453223};
        System.out.println(arr.length);

        Arrays.sort(arr);
        System.out.println("Largest element is "+ arr[arr.length-1]);
        System.out.println("Smallest element is "+arr[0]);





    }
}
