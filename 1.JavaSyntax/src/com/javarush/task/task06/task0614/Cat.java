package com.javarush.task.task06.task0614;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/* 
Статические коты
*/

public class Cat {
    //напишите тут ваш код
    public static ArrayList<Cat> cats = new ArrayList<>();

    public Cat() {

        
    }

    public static void main(String[] args) {
        //напишите тут ваш код
        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new Cat());

        printCats();
    }

    public static void printCats() {
        //напишите тут ваш ;
        for(int i = 0; i< 10; i++) System.out.println(cats.get(i));
    }
}
