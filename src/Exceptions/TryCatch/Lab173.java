package Exceptions.TryCatch;

import java.io.File;
import java.io.FileReader;

public class Lab173 {
    public static void main(String[] args){
        int a = 10 / 0; //Unchecked exception- JVM dont know about this

        //Checked
        try {
            FileReader fileReader = new FileReader(new File("C:/a.txt"));
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }

}
