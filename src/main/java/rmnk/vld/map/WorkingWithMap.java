package rmnk.vld.map;

import java.util.HashMap;
import java.util.Map;

public class WorkingWithMap {
    public static void main(String[] args) {
        mapped();
    }
    private static void mapped() {
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

    record Person(String s){}
}
