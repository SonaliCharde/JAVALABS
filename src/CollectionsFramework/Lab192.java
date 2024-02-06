package CollectionsFramework;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Lab192 {
    public static void main(String[] args) {
        Set courseSets = new LinkedHashSet();

        courseSets.add("ATB");
        courseSets.add("MTB");
        courseSets.add("LAPIT");
        courseSets.add("SDET Blueprint");
        courseSets.add("Java for Testers");

        System.out.println(courseSets);

        for (Object o : courseSets){
            System.out.println(o);
        }

        Iterator it = courseSets.iterator();
        System.out.println(it.next());

    }
}
