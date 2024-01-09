package Arrays;

public class Lab125 {
    public static void main(String[]args){
        //Printing Diagonal elements of 2D array
        //        |1, 2, 3,|
        //        |4, 5, 6 |
        //        |7, 8, 9 |
        //        // i= j
        int[][] arr2d = new int[3][3];
        arr2d[0][0] = 1;
        arr2d[0][1] = 2;
        arr2d[0][2] = 3;
        arr2d[1][0] = 4;
        arr2d[1][1] = 5;
        arr2d[1][2] = 6;
        arr2d[2][0] = 7;
        arr2d[2][1] = 8;
        arr2d[2][2] = 9;

        for (int i=0; i<arr2d.length;i++){
            for (int j=0; j<arr2d[i].length;j++){
                if (i==j){
                    System.out.println(arr2d[i][j]);
                }
                else {
                    arr2d[i][j] =0;
                    System.out.println(" "+arr2d[i][j]);
                }
            }
        }

    }
}
