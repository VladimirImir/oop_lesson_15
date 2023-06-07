package com.dev.lesson18;
/**
 * Collection - shift-shift - ВВЕДЕНИЕ.  Какие есть интерфейсы коллекции ?
 */
/** Какие есть интерфейсы коллекции ? */
/** Ctrl + H - открыть иерархию наследования для текущего класса. */

/** 19.2 - Оценка сложности алгоритмов. Big O notation. */

import java.util.Iterator;

/** List.of - создают неизменяемый список! */


public class List<T> implements Iterable<T> {

    private T[] objects;
    private int size;

    public List(int initialSize) {
        this.objects = (T[]) new Object[initialSize];
    }

    public void add(T element) {
        objects[size++] = element;
    }

    public T get(int index){
        return objects[index];
    }

    public int getSize(){
        return size;
    }

    @Override
    public Iterator<T> iterator() {
        return new ListIterator();
    }

    /** Реализация интерфейса - iterator. */

    private class ListIterator implements Iterator<T> {

        private int currentIndex;

        @Override
        public boolean hasNext() {
            return currentIndex < size;
        }

        @Override
        public T next() {
            return objects[currentIndex++];
        }
    }
}
