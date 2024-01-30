package CollectionsFramework;

import java.util.ArrayList;
import java.util.List;

public class Lab179 {
    public static void main(String[] args) {
        List myList = new ArrayList();
        myList.add("Sonali");
        myList.add(120);
        myList.add(true);

        System.out.println(myList);
        myList.set(1,"Sonali");
        System.out.println(myList);
//        myList.remove("Sonali");
//        System.out.println(myList);
//        myList.remove("Sonali");
//        System.out.println(myList);

        for (int i=0; i< myList.size();i++){
            System.out.println(myList.get(2));
        }
        for (Object o:myList){
            System.out.println(o);
        }
    }
}
