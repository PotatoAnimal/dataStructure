package rmnk.vld.stack;

import java.util.Stack;

public class WorkingWithStack {
    public static void main(String[] args) {
        //It`s all about first in - last out. Like with pringles
        //U open it and eating from the last one who came into a package
        //FIRST IS LAST - LAST IS FIRST

        //Stack extend Vector which implement List. so IDK is it good idea to use it
        Stack<Integer> integers = new Stack<>();

        integers.push(1);
        integers.push(2);
        integers.push(3);

        System.out.println(integers); //shows all list
        System.out.println(integers.peek()); //shows TOP means 3 in this example
        System.out.println(integers.size()); //shows size || 3
        System.out.println(integers.pop()); //shows last element and removing it
        System.out.println(integers.empty()); //bool || ofc false
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println(integers.size());
        System.out.println(integers);
    }
}
