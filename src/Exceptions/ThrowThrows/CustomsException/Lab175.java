package Exceptions.ThrowThrows.CustomsException;

import java.io.FileReader;

public class Lab175 {
    public static void main(String[] args) {
        String path = "C:/a.txt";

        try {
            FileReader f = new FileReader(path);
        }catch (Exception e){

        }


    }
}
