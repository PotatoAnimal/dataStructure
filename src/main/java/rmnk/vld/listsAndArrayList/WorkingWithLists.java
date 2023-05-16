package rmnk.vld.listsAndArrayList;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithLists {
    public static void main(String[] args) {
        //Do not do like this
        List shitty = new ArrayList();
        shitty.add("purple");
        shitty.add("blue");
        shitty.add(1);
        shitty.add(new Object());
        System.out.println(shitty);

        //Do this
        List<String> colors = new ArrayList<>();
        colors.add("purple");
        colors.add("blue");
        System.out.println(colors);
        colors.forEach(System.out::println);
        for (int i = 0 ; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }
    }
}
