package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static Set<Integer> createSet() {
        // напишите тут ваш код
        Set<Integer> list = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            list.add(i);
        }
        return list;

    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        // напишите тут ваш код
        Set<Integer> copySet = new HashSet<>(set);
        for (Integer value : copySet) {
            if(value > 10) set.remove(value);
        }
        return set;

    }

    public static void main(String[] args) {

    }
}
