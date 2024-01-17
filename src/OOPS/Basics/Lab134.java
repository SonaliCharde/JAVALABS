package OOPS.Basics;

public class Lab134 {
    public static void main(String[] args) {

        //Immutable in nature (that cannot be changed)

        String password = "pass123";

        //I want to change the password 1000 times
        //What should I use??
        //String builder or String buffer??
        //string builder should be used to make the string mutable

        StringBuilder sb = new StringBuilder("pass");
        for (int i =0; i<10; i++){
            sb.append("@123");
            System.out.println(sb);
        }

    }
}
