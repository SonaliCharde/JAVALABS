package MiscInterviewProblems;

public class Printingdiagonalelementsof2Darray {
    public static void main(String[]args){
        int[][] arr2D = new int[3][3];
        arr2D[0][0] = 1;
        arr2D[0][1] = 2;
        arr2D[0][2] = 3;
        arr2D[1][0] = 4;
        arr2D[1][1] = 5;
        arr2D[1][2] = 6;
        arr2D[2][0] = 7;
        arr2D[2][1] = 8;
        arr2D[2][2] = 9;

        for (int i =0; i< arr2D.length;i++){
            for (int j = 0; j< arr2D[i].length;j++){
                if (i==j){
                    System.out.println(arr2D[i][j]);
                }
                else {
                    arr2D[i][j]=0;
                    System.out.println(" "+arr2D[i][j]);
                }
            }
        }
    }
}
