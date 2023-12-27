package Arrays;

public class Lab1102DArray {
    public static void main(String[]args){
        int[] arr1 = {1,2,3,4,5}; // 1-D array

        int[][] arr2 = new int[3][3];

        //Entering elements in the rows of an array
        //Initialising first row of an array which is 0
        arr2[0][0] = 100;
        arr2[1][0] = 99;
        arr2[2][0] = 98;

        //Initialising second row of an array which is 1
        arr2[1][0] = 97;
        arr2[1][1] = 96;
        arr2[1][2] = 95;

        //Initialising third row of an array which is 2
        arr2[2][0] = 94;
        arr2[2][1] = 93;
        arr2[2][2] = 92;

        for (int i=0;i< arr2.length;i++){
            for (int j=0; j< arr2[i].length;j++)
                System.out.print(arr2[i][j]+"\t");
            }
        System.out.println("");
    }
}
