package rmnk.vld.arrays;

import java.util.Arrays;

public class TheArrays {
    public static void main(String[] args) {
        String[] colors = new String[5];
        colors[0] = "purple";
        colors[1] = "blue";
        System.out.println(colors);
        System.out.println(Arrays.toString(colors));
        System.out.println(colors[0]);
        System.out.println("--------------------------------------------------------------------------------------------");

        int[] numbers = {100, 200};
        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers));

        int[] ints = new int[2];
        ints[0] = 100;
        ints[1] = 200;
        System.out.println(ints);
        System.out.println(Arrays.toString(ints));
        System.out.println("--------------------------------------------------------------------------------------------");

        //default array
        for (int i = 0; i < colors.length; i++) {
            System.out.println(colors[i]);
        }
        //reverse array
        for (int i = colors.length - 1; i >= 0; i--) {
            System.out.println(colors[i]);
        }
        //kinda loop
        for (String s : colors){
            System.out.println(s);
        }
        //Stream API
        Arrays.stream(colors).forEach(System.out::println);
    }
}

