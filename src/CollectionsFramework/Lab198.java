package CollectionsFramework;

import java.util.*;

public class Lab198 {
    public static void main(String[] args) {
        Map <String,Integer> map = new WeakHashMap<>();
        Map <String, Integer> map1 = new HashMap<>();
        Map <String, Integer> map2 = new TreeMap<>();
        Map <String, Integer> map3 = new LinkedHashMap<>();
        map.put("Sonali", 1);
        map.put("Tushar",2);
        map.put("Riyansh", 3);
        map.put("Riya",4);
        System.out.println(map);
        System.out.println(map1.isEmpty());
        System.out.println(map.size());
        System.out.println(map.containsValue("Sonali"));
        System.out.println(map.containsKey("Sonali"));

//        for (Map.Entry<String,Integer>) item:map.entrySet()){
//            System.out.println(item.getKey() +" ->" +item.getValue());
//        }

    }
}
