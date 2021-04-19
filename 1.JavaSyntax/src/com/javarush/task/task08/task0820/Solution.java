package com.javarush.task.task08.task0820;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* 
Множество всех животных
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);
        System.out.println(" --------------");

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        Set<Cat> result = new HashSet<Cat>();
        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());
        //напишите тут ваш код

        return result;
    }

    public static Set<Dog> createDogs() {
        Set<Dog> dogs = new HashSet<>();
        dogs.add(new Dog());
        dogs.add(new Dog());
        dogs.add(new Dog());
        //напишите тут ваш код
        return dogs;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        //напишите тут ваш код
        Set<Object> animals = new HashSet<>(cats);
        animals.addAll(dogs);
        return animals;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        //напишите тут ваш код
//
        pets.removeAll(cats);


        }
    

    public static void printPets(Set<Object> pets) {
        //напишите тут ваш код
        for (Object оbj: pets) {
            System.out.println(оbj);
        }
    }

    private static class Dog {
    }

    private static class Cat {
    }

    //напишите тут ваш код
}
