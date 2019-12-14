package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    //напишите тут ваш код
    String name, address, color;
    int age, weight;
     public void initialize(String name){
         this.name = name;
         color ="DefoltColor";
         age = 1;
         weight = 5;
     }
    public void initialize(String name, int weight, int age){
        this.name = name;
        color ="DefoltColor";
        this.age = age;
        this.weight = weight;
    }
    public void initialize(String name, int age){
        this.name = name;
        color ="DefoltColor";
        this.age = age;
        weight = 5;
    }
    public void initialize(int weight, String color){
        this.weight = weight;
        this.color =color;
        this.age = age;
    }
    public void initialize(int weight, String color, String address){
        this.weight = weight;
        this.color =color;
        this.address = address;
        age = 1;
    }

    public static void main(String[] args) {

    }
}
