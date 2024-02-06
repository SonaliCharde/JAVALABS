package CollectionsFramework;

import java.util.HashSet;
import java.util.Set;

public class Lab190 {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Watermelon");
        //fruits.add(123); not allowed

        System.out.println(fruits);
        System.out.println(fruits.size());
        System.out.println(fruits.contains("Mango"));
        System.out.println(fruits.isEmpty());
    }
}
