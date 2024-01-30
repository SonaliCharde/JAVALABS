package CollectionsFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab180 {
    public static void main(String[] args) {
        List<String> mylist = new ArrayList<>();
        mylist.add("Sonali");
        mylist.add("Tushar");
        mylist.add("Riya");
        mylist.add("Riyansh");

        System.out.println(mylist);

        System.out.println("--------------------------------");

        //For loop
        for (int i = 0; i < mylist.size(); i++) {
            System.out.println(mylist.get(i));
        }

        System.out.println("--------------------------------");

        //For Each Loop
        for (String o : mylist) {
            System.out.println(o);
        }
        System.out.println("--------------------------------");

        //Iterator
        Iterator iterator = mylist.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
