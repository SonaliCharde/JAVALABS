package Arrays;

public class Lab106 {
    public static void main(String[]args){
        int[] marks = new int[4];
        marks[0] = 98;
        marks[1] = 99;
        marks[2] = 100;
        marks[3] = 101;

        //Using while loop for iteration

        int i =0;
        while (i<marks.length){
            System.out.println(marks[i]);
            System.out.println(marks[i]*2);
            i++;
        }
    }
}
