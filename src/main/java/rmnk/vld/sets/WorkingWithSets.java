package rmnk.vld.sets;

import java.util.HashSet;
import java.util.Set;

public class WorkingWithSets {
    public static void main(String[] args) {
        //This collection has no duplicates
        //No method get. u can only stream and get element in random way
        //Here we have 3 impl like: HashSet N TreeSet N ENUM

        Set<Ball> balls = new HashSet<>();
        balls.add(new Ball("red"));
        balls.add(new Ball("red"));
        balls.add(new Ball("red"));
        balls.add(new Ball("blue"));
        balls.add(new Ball("purple"));
        balls.add(new Ball("yellow"));

        balls.forEach(System.out::println);
    }
    record Ball (String s){}
}
