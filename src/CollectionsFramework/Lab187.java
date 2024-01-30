package CollectionsFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Lab187 {
    public static void main(String[] args) {
        List<Integer> marks = new ArrayList<>();
        marks.add(98);
        marks.add(65);
        marks.add(67);
        marks.add(90);
        marks.add(89);

        Collections.sort(marks);
        System.out.println(marks);
    }
}
