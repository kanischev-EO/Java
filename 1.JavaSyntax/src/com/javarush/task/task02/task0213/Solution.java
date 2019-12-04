package com.javarush.task.task02.task0213;

/* 
Питомцам нужны люди
*/
public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Cat cat1 = new Cat();
        Dog dog1 = new Dog();
        Fish fish1 = new Fish();
        Woman woman1 = new Woman();
        cat1.owner = woman1;
        dog1.owner = woman1;
        fish1.owner = woman1;
    }

    public static class Cat {
        public Woman owner;
    }

    public static class Dog {
        public Woman owner;
    }

    public static class Fish {
        public Woman owner;
    }

    public static class Woman {
    }
}
