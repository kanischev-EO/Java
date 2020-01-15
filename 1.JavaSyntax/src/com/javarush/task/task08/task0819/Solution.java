package com.javarush.task.task08.task0819;

import java.util.HashSet;
import java.util.Set;

/* 
Set из котов
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Cat cat = null;
        for (Cat catok: cats) {
            cat = catok;
        }
        cats.remove(cat);


        //напишите тут ваш код. step 3 - пункт 3

        printCats(cats);
    }

    public static Set<Cat> createCats() {
        //напишите тут ваш код. step 2 - пункт 2
        Set<Cat> catiti = new HashSet<>();
        catiti.add(new Cat());
        catiti.add(new Cat());
        catiti.add(new Cat());
        return catiti;
    }

    public static void printCats(Set<Cat> cats) {
        // step 4 - пункт 4
        for (Cat cat : cats) {
            System.out.println(cat);
        }
    }
    public static class Cat{

    }

    // step 1 - пункт 1
}
