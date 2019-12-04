package com.javarush.task.task08.task0820;

import javax.swing.text.html.CSS;
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
        Set<Cat> result = new HashSet<Cat>();
        for (int i = 0; i < 4; i++) {
            result.add(new Cat());
        }

        //напишите тут ваш код

        return result;
    }

    public static Set<Dog> createDogs() {
        //напишите тут ваш код
        Set<Dog> dogs = new HashSet<Dog>();
        for (int i = 0; i < 3 ; i++) {
            dogs.add(new Dog());
        }
        return dogs;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        //напишите тут ваш код
        Set<Object> pets = new HashSet<>();
        pets.addAll(cats);
        pets.addAll(dogs);
        return pets;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        //напишите тут ваш код
        Set<Object> copyPets = new HashSet<>(pets);
        for (Cat catik: cats) {
            if(copyPets.contains(catik)) pets.remove(catik);

        }

        }

    public static void printPets(Set<Object> pets) {
        //напишите тут ваш код
        for (Object myAnimal: pets) {
            System.out.println(myAnimal);

        }
    }

    //напишите тут ваш код
    public static class Dog{}
    public static class Cat{}
}
