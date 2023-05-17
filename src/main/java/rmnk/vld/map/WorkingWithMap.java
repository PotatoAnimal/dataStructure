package rmnk.vld.map;

import rmnk.vld.hashFunctionsAndHashCode.WorkingWithHashFunctionsAndHashCode;

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
        WorkingWithHashFunctionsAndHashCode.mapping(map);
        System.out.println(map.getOrDefault(2, new Person("def")));
        System.out.println(map.size());
    }

    public record Person(String s){}
}
