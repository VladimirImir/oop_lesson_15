package com.dev.lesson19;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/** 19.4 - LinkedList. */

public class ArrayListRunner {

    // [1, 2, 3, 4, 5]
    // [1, 2, 3, 4, 5, 6, null]
    public static void main(String[] args) {
        // List<Integer> integers = new ArrayList<>(5);
        List<Integer> integers = new LinkedList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);
        integers.add(6);

        System.out.println(integers.get(5));
        System.out.println(integers.contains(4));
        System.out.println(integers.contains(40));
    }
}
