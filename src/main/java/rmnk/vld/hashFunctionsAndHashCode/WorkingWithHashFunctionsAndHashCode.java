package rmnk.vld.hashFunctionsAndHashCode;

import rmnk.vld.map.WorkingWithMap;

import java.util.HashMap;
import java.util.Map;

public class WorkingWithHashFunctionsAndHashCode {
    public static void main(String[] args) {
        //Always override hash and equal methods
        //here a few examples how and where u can use hashMap
        //gl in future
        Map<WorkingWithMap.Person, Diamond> newMap = new HashMap<>();
        newMap.put(new WorkingWithMap.Person("Vlad"), new Diamond("Ukrainian diamond"));
        newMap.put(new WorkingWithMap.Person("Vlad"), new Diamond("Ukrainian diamond"));

        System.out.println(new WorkingWithMap.Person("Vlad").hashCode());
        System.out.println(new WorkingWithMap.Person("Vlad").hashCode());
        Object o1 = newMap.get(new WorkingWithMap.Person("Vlad"));
        Object o2 = newMap.get(new WorkingWithMap.Person("Sergio"));
        System.out.println(o1.equals(o2));

        System.out.println(newMap.get(new WorkingWithMap.Person("Vlad")));
    }

    private static void mapper() {
        Map<Integer, WorkingWithMap.Person> map = new HashMap<>();

        map.put(1, new WorkingWithMap.Person("Vlad"));
        map.put(2, new WorkingWithMap.Person("Vlad"));
        map.put(3, new WorkingWithMap.Person("Roma"));
        mapping(map);
        System.out.println(map.getOrDefault(2, new WorkingWithMap.Person("def")));
        System.out.println(map.size());
    }

    public static void mapping(Map<Integer, WorkingWithMap.Person> map) {
        System.out.println(map);
        System.out.println(map.entrySet());
        System.out.println(map.keySet());
        System.out.println(map.containsKey(3));
        System.out.println(map.values());
        System.out.println(map.remove(2));
        System.out.println(map);
    }

    record Diamond(String name) {
    }
}
