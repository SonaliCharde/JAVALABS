package Arrays;

public class Lab101 {
    public static void main (String[]args){
        int[] arr1 = {1,2,3,4,5,6,7};
        System.out.println("Lenght of an arr1 = "+arr1.length);
        System.out.println("Ref address = "+arr1);
        System.out.println(arr1);
        for (int i=0; i< arr1.length;i++){ //i<arr.lenght will print only till 6
            System.out.println(i);
        }
        for (int i=0; i<= arr1.length;i++){ ////i<arr.lenght will print only till 7
            System.out.println(i);
        }
    }
}
