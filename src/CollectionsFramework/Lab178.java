package CollectionsFramework;

import java.util.List;
import java.util.ArrayList;
import java.util.List;

public class Lab178 {
    public static void main(String[] args) {
        //Collections Framework
        List Fruits = List.of("Orange","Mango","Apple","Banana","Watermelon");
        List Shopping = List.of("Bread", "Milk","butter","Chocolate");
        List my_10thMarks = List.of(99,89,78,90,89);
        List diffDataTypes = List.of("Pramod",true,123);

        System.out.println(Fruits.get(0));
        System.out.println(Shopping.get(3));
        System.out.println(Shopping.size());
        System.out.println(my_10thMarks.indexOf(90));

        //IsEmpty
        System.out.println(Fruits.isEmpty());
        Fruits.add("Papaya");
        Fruits.remove("Apple");
        //System.out.println(Shopping);



        //Arraylist and LinkedList - Add or replace anything - Full Authority
    }
}
