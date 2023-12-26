package Arrays;

public class Lab100 {
    public static void main (String[]args){
        int[] arr1= {1,2,3,4,5};
        int[] arr2 = {1,2,3,4,5};

        System.out.println(arr1==arr2);
        boolean compare = arr1 == arr2;
        System.out.println(compare); //False as array will always see the refrences
        System.out.println("--------------------------------------------------");

        int[] arr3 = arr1;
        System.out.println(arr3==arr1); //true as we have assigned arr1 to arr3
        System.out.println(arr3==arr2); //False as array will always see the refrences
        System.out.println("--------------------------------------------------");

        arr3[0] = 10;
        System.out.println(arr1[0]);
        // As arr3 = arr1 is declared, changing the values in arr3 will
        // automatically update the values in arr1
        System.out.println("--------------------------------------------------");

        String[] items1 = {"House", "Car", "LIC", "Fees"};
        String[] items2 = {"House", "Car", "LIC", "Fees"};
        System.out.println(items1==items2); //false as reference will be chceked
        System.out.println("--------------------------------------------------");

        items1=items2;
        System.out.println(items1==items2); //true as items1 is assigned to items2

        System.out.println(arr1.equals(arr2)); //False because int arr. will check for the refrences
        System.out.println(items1.equals(items2));
    }
}
