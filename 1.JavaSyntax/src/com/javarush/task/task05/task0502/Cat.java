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
        byte b1 = 0, b2 = 0;
        if(this.age > anotherCat.age) b1++; else if (this.age < anotherCat.age) b2++;
        if(this.weight > anotherCat.weight) b1++; else if (this.weight < anotherCat.weight) b2++;
        if(this.strength > anotherCat.strength) b1++; else if (this.strength < anotherCat.strength) b2++;
        return b1 > b2;
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.age = 2;
        Cat cat2 = new Cat();
        System.out.println(cat1.fight(cat2));

    }
}
