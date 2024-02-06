package CollectionsFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Lab191 {
    public static void main(String[] args) {
        Set coursesets = new HashSet();
        coursesets.add("ATB");
        coursesets.add("MTB");
        coursesets.add("LAPIT");
        coursesets.add("SDET Blueprint");
        coursesets.add("Java for Testers");

        System.out.println(coursesets);
        for (Object o :coursesets){
            System.out.println(o);
        }

        Iterator it = coursesets.iterator();
        System.out.println(it.next());

    }
}
