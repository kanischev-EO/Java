package com.javarush.task.task05.task0515;

/* 
Инициализация объектов
*/

public class Person {
    String name;
    char sex;
    int money;
    int weight;
    double size;


    public void initialize(String name, int money, char sex, double size, int weight) {
        this.name = name;
        this.money = money;
        this.sex = sex;
        this.size = size;
        this.weight = weight;

    }

    public static void main(String[] args) {

    }
}
