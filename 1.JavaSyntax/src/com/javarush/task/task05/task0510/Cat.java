package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    //напишите тут ваш код
    String name;
    int age;
    int weight;
    String address;
    String color;
    public void initialize(String name){
        this.name = name;
        this.age = 2;
        this.weight = 2;
        this.color = "Cерый";
    }
    public void initialize(String name, int weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "Cерый";
    }
    public void initialize(String name, int age){
        this.name = name;
        this.age = age;
        this.weight = 2;
        this.color = "Cерый";

    }
    public void initialize(int weight, String color){
        this.age = 2;
        this.weight = weight;
        this.color = color;

    }
    public void initialize(int weight, String color,String address){
        this.age = 2;
        this.address =address;
        this.weight = weight;
        this.color = color;

    }


}
