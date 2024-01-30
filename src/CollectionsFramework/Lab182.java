package CollectionsFramework;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Lab182 {
    public static void main(String[] args) {
        List<String> mylist = new LinkedList<>();
        mylist.add("Pramod");
        mylist.add("Sonali");
        mylist.add("Tushar");
        mylist.add("Riya");
        System.out.println(mylist);

        List<Integer> list = new LinkedList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }

}
