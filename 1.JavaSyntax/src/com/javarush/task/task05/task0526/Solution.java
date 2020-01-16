package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Man man = new Man("Кирилл", 26, "Хогвардс д 10 к 1");
        Man man1 = new Man("Андрей", 15, "Школа 1681, Грина д 30");
        Woman woman = new Woman("Оля", "МИИТ на Ордынке", 25);
        Woman woman1 = new Woman("Надя", "ПТУ, а не колледж", 19);
        System.out.println(man);
        System.out.println(man1);
        System.out.println(woman);
        System.out.println(woman1);
    }
public static class Man{
        String name, address;
        int age;

    public Man(String name,int age, String address ) {
        this.name = name;
        this.age = age;
        this.address = address;

    }

    @Override
    public String toString() {
        return "name " + name +
                " age " + age +
                " address " + address;
    }
}
    public static class Woman{
        String name, address;
        int age;

        public Woman(String name, String address, int age) {
            this.name = name;
            this.address = address;
            this.age = age;
        }

        @Override
        public String toString() {
            return "name " + name +
                    " age " + age +
                    " address " + address;
        }
    }
    //напишите тут ваш код
}
