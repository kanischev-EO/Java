package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        //напишите тут ваш код
        int compareAge = age > anotherCat.age ? 1: 0;
        int compareWeight = weight > anotherCat.weight ? 1 :0;
        int compareStrenght = strength > anotherCat.strength ? 1 : 0;
        return compareAge + compareWeight + compareStrenght >=2 ? true :false;
    }

    public static void main(String[] args) {

    }
}
