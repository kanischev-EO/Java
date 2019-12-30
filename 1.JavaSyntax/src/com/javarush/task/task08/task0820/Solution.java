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

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        Set<Cat> cats = new HashSet<Cat>();
        for (int i = 0; i < 4 ; i++) {
            cats.add(new Cat());
        }
        //напишите тут ваш код
        return cats;
    }

    public static Set<Dog> createDogs() {
        //напишите тут ваш код
        Set<Dog> dogs = new HashSet<>();
        for (int i = 0; i < 3 ; i++) {
            dogs.add(new Dog());
        }
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
        for (Cat catik : cats) {
            if(pets.contains(catik)) pets.remove(catik);
        }
    }

    public static void printPets(Set<Object> pets) {
        //напишите тут ваш код
        for (Object animals : pets ) {
            System.out.println(animals);
        }
    }
    public static class Cat{}
    public static class Dog{}

    //напишите тут ваш код
}
