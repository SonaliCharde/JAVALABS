package CollectionsFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Lab183 {
    public static void main(String[] args) {
        List <String> courselist = new ArrayList<>();
        courselist.add("ATB");
        courselist.add("MTB");
        courselist.add("PyATB");
        courselist.add("LAPIB");
        courselist.add("SDET Blueprint");

        List numList = new ArrayList<>();
        numList.add(1);
        numList.add(2);
        numList.add(3);
        numList.add(4);
        numList.add(5);

        courselist.addAll(numList);
        System.out.println(courselist);

        Iterator iterator = courselist.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());


        }

    }
}
