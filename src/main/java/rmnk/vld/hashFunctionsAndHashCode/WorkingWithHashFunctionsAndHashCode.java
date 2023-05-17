package rmnk.vld.hashFunctionsAndHashCode;

import java.util.HashMap;
import java.util.Map;

public class WorkingWithHashFunctionsAndHashCode {
    public static void main(String[] args) {
        //Always override hash and equal methods
        //here a few examples how and where u can use hashMap
        //gl in future
        Map<Person, Diamond> newMap = new HashMap<>();
        newMap.put(new Person("Vlad"), new Diamond("Ukrainian diamond"));
        newMap.put(new Person("Vlad"), new Diamond("Ukrainian diamond"));

        System.out.println(new Person("Vlad").hashCode());
        System.out.println(new Person("Vlad").hashCode());
        Object o1 = newMap.get(new Person("Vlad"));
        Object o2 = newMap.get(new Person("Vlad"));
        System.out.println(o1.equals(o2));

        System.out.println(newMap.get(new Person("Vlad")));
    }

    private static void mapper() {
        Map<Integer, Person> map = new HashMap<>();

        map.put(1, new Person("Vlad"));
        map.put(2, new Person("Vlad"));
        map.put(3, new Person("Roma"));
        System.out.println(map);
        System.out.println(map.entrySet());
        System.out.println(map.keySet());
        System.out.println(map.containsKey(3));
        System.out.println(map.values());
        System.out.println(map.remove(2));
        System.out.println(map);
        System.out.println(map.getOrDefault(2, new Person("def")));
        System.out.println(map.size());
    }

    record Person(String s) {
    }

    record Diamond(String name) {
    }
}
