package rmnk.vld.queue;

import java.util.LinkedList;
import java.util.Queue;

public class WorkingWithQueue {
    public static void main(String[] args) {
        //Here we have reverse of Stuck princeple.
        //FIRST IN - FIRST OUT || FIFO

        Queue<Person> people = new LinkedList<>();

        people.add(new Person("Maks", 19));
        people.add(new Person("Roma", 23));
        people.add(new Person("Vlad", 21));

        System.out.println(people.peek()); // sout first element
        System.out.println(people.poll()); // sout first element and remove it
        System.out.println(people);
    }
    record Person(String name, int age){}
}
