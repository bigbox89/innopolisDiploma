package com.github.apppetr.javaPractice.Homework17;

/**
 * ДЗ 17. Удаление элемента по индексу
 * Реализовать метод T get(int index) для LinkedList
 */
public class Main {
    public static void main(String[] args) {
        //-------------------------------Linked List----------------------//
        LinkedList<Integer> list = new LinkedList<>();
        list.add(34);
        list.add(120);
        list.add(-10);
        list.add(11);
        list.add(50);
        list.add(100);
        list.add(99);
        //Запрос элемента по индексу массива
        System.out.println( list.get(1));

    }


}
