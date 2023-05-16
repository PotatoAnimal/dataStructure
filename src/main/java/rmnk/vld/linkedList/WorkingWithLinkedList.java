package rmnk.vld.linkedList;

import rmnk.vld.queue.WorkingWithQueue;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

public class WorkingWithLinkedList {
    public static void main(String[] args) {
        //usage of memory is too much. Use with good thinking.
        LinkedList<Person> linkedList = new LinkedList<>();
        linkedList.add(new Person("Vlad", 23));
        linkedList.add(new Person("Vlad", 22));
        linkedList.add(new Person("Vlad", 21));
        System.out.println(linkedList);

        System.out.println("--------------------------------------------------------------------------------------------");

        ListIterator<Person> listIterator = linkedList.listIterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
        System.out.println("--------------------------------------------------------------------------------------------");
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }



    }
    private static void queues() {
        Queue<WorkingWithQueue.Person> people = new LinkedList<>();

        people.add(new WorkingWithQueue.Person("Maks", 19));
        people.add(new WorkingWithQueue.Person("Roma", 23));
        people.add(new WorkingWithQueue.Person("Vlad", 21));

        System.out.println(people.peek()); // sout first element
        System.out.println(people.poll()); // sout first element and remove it
        System.out.println(people);
    }

    public record Person(String name, int age){}
}
