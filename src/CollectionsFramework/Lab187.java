package CollectionsFramework;

import java.util.*;

public class Lab187 {
    public static void main(String[] args) {
        List<Integer> marks = new ArrayList<>();
        marks.add(98);
        marks.add(65);
        marks.add(67);
        marks.add(90);
        marks.add(89);
        System.out.println(marks);
        Collections.sort(marks);
        System.out.println(marks);

        ListIterator iterator = marks.listIterator();
       while (iterator.hasNext()) {
           System.out.println(iterator.next());
       }
    }
}
