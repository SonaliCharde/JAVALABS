package Arrays;

public class Lab099 {
    public static void main(String[]args){
        int[] marks = {98,99,87,86,56};
        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);

        //if values are not specified then the default value will be 0
        int[] marks_1 = new int[4];
        System.out.println(marks_1[0]);
        System.out.println(marks_1[1]);
        System.out.println(marks_1[2]);
        System.out.println(marks_1[3]);
        marks_1[0]=99;
        System.out.println(marks_1[0]);

        //if array is assigned the final keyword then only the array length will be final
        //we can still assign/change the values
        final int[] b =new int[4];
        b[1]=77;
        System.out.println(b[1]);



    }

}
