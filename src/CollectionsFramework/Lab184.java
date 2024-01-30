package CollectionsFramework;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Lab184 {
    public static void main(String[] args) {
        List ttacourseList = new ArrayList();
        ttacourseList.add("ATB");
        ttacourseList.add("MTB");
        ttacourseList.add("LAPIT");
        ttacourseList.add("SDET Blueprint");
        ttacourseList.add("Java for Testers");

        ListIterator lt = ttacourseList.listIterator();
        while (lt.hasNext()){
            System.out.println(lt.next());
        }

        System.out.println("------------------------------------------");

//        ListIterator lt1 = ttacourseList.listIterator(ttacourseList.size());
//        while (lt1.hasPrevious()){
//            ttacourseList.add("Gen AI");
//            lt1.add("Gen AI");
//            System.out.println(lt1.previous());
//        }
    }
}
