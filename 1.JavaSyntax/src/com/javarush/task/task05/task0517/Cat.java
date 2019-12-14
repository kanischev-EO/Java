package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    //напишите тут ваш код
    String name, address, color;
    int age, weight;

    public Cat(String name) {
        this.name = name;
        weight = 10 ;
        age = 1 ;
        color = "DefaultColor";
    }

    public Cat(String name, int weight, int age) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        color = "DefaultColor";
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        color = "DefaultColor";
        weight = 10;
    }
    public Cat(int weight, String color) {
        this.weight = weight;
        this.color = color;
        age = 1 ;

    }
    public Cat(int weight, String color, String address) {
        this.weight = weight;
        this.color = color;
        this.address = address;
        age = 1;
    }


    public static void main(String[] args) {

    }
}
