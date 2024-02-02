package Exceptions.ThrowThrows.CustomsException;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab172 {
    public static void main(String[] args)throws Exception {
        main("Sonali");

    }
    static void main(String a) throws Exception {
        FileReader f = new FileReader("C:/a.txt");

        if (a.equalsIgnoreCase("a")){
            throw new ArithmeticException();
        }

    }
}
