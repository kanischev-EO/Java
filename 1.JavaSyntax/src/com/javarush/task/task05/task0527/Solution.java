package com.javarush.task.task05.task0527;

/* 
Том и Джерри
*/

public class Solution {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);
        Dog laccy = new Dog("Laccy", 12, 60);
        Cat Jasper = new Cat("Jaspi", 6, 20);


        //напишите тут ваш код
    }

    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Dog {
        String name;
        int age, weight;

        public Dog(String name, int age, int weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }}

        public static class Cat {
            String name;
            int age, weight;

            public Cat(String name, int age, int weight) {
                this.name = name;
                this.age = age;
                this.weight = weight;
            }
        }
    }
