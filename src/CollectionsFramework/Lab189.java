package CollectionsFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab189 {
    public static void main(String[] args) {

        List<Integer> marks = new ArrayList<>();
        marks.add(28);
        marks.add(34);
        marks.add(56);
        marks.add(89);
        marks.add(90);
        marks.add(78);
        Collections.sort(marks);
        System.out.println(marks);

        Student student1 = new Student(1, "Sonali");
        Student student2 = new Student(10,"Tushar");


        List Studentss = new ArrayList<>();
        Studentss.add("Student1");
        Studentss.add("Student2");
        Studentss.add("Student3");
        Studentss.add("Student4");
        Studentss.add("Student5");
        Studentss.add("Student6");
        System.out.println(Studentss);

        // Comparable -> 1 id or name not both are not allowed -
        // Comparator - id, name
        // Create a class and implement comparator and tell the Integer


    }
}
