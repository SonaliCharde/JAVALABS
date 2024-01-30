package CollectionsFramework;

import java.util.Enumeration;
import java.util.Vector;

public class Lab185 {
    public static void main(String[] args) {
        Vector<String > vector = new Vector<>();
        vector.add("sonali");
        vector.add("tushar");
        vector.add("Riya");

        Enumeration enumeration=  vector.elements();
        while (enumeration.hasMoreElements()) {

            System.out.println(enumeration.nextElement());
        }


    }
}
