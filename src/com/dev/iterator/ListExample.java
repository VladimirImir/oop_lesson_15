package com.dev.iterator;


import com.dev.lesson18.List;

public class ListExample {

    public static void main(String[] args) {

        /** Свой итератор в цикле foreach. */

        List<String> list = new List<>(10);
        list.add("string1");
        list.add("string2");
        list.add("string3");
        list.add("string4");

        /*for (String value : list) {
            System.out.println(value);
        }*/
        /** list.iterator().forEachRemaining(System.out::println); - тот же цикл что и выше написанныей,
         * только современный.
         * */
        list.iterator().forEachRemaining(System.out::println);
    }
}
