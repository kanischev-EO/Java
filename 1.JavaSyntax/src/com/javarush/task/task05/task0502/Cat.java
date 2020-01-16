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
        int countThisCat = 0;
        int countAnotherCat = 0;
        int fightAge = this.age > anotherCat.age? countThisCat++ : countAnotherCat++;
        int fightWeight = this.weight > anotherCat.weight? countThisCat++ : countAnotherCat++;
        int fightStrength = this.strength > anotherCat.strength? countThisCat++ : countAnotherCat++;

        return countThisCat > countAnotherCat ? true : false;
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.strength = 40;
        cat.weight = 40;
        cat.age = 10;
        Cat cat2 = new Cat();
        cat2.age = 20;
        cat2.strength = 10;
        cat2.weight = 40;
        System.out.println(cat.fight(cat2));


    }
}
