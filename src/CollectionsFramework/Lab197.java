package CollectionsFramework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab197 {
    public static void main(String[] args) {
        Set<Integer> s1 = new HashSet<>();
        s1.add(10);
        s1.add(232);
        s1.add(354);
        s1.add(44);
        s1.add(55);
        s1.add(667);
        s1.add(73);
        s1.add(238);
        s1.add(943);
        s1.add(1023);
//Hashset stores elements randomly
        System.out.println(s1);

        Set<Integer> s2 = new LinkedHashSet<>();
        s2.add(3411);
        s2.add(1432);
        s2.add(13);
        s2.add(144);
        s2.add(353);
        s2.add(1634);
        s2.add(137);
        s2.add(618);
        s2.add(1549);
        s2.add(2000);
//LinkedHashSet stores the elements as entered by the user
        System.out.println(s2);

        Set<Integer> s3 = new TreeSet<>();
        s3.add(321);
        s3.add(232);
        s3.add(3423);
        s3.add(624);
        s3.add(9825);
        s3.add(4526);
        s3.add(527);
        s3.add(268);
        s3.add(2659);
        s3.add(3);
//Treeset sorts the elements when and then stores
        System.out.println(s3);


    }
}
