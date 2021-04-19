package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Man man1 = new Man("Вася",20, "Москва");
        Man man2 = new Man("Олег",55, "Воронеж");
        Woman woman1 = new Woman("Наталия", 50, "Cанкт-Петербург");
        Woman woman2 = new Woman("Оля", 18 ,"Орёл");
        System.out.println(man1);
        System.out.println(man2);
        System.out.println(woman1);
        System.out.println(woman2);
    }
    public static class Man{
        String name;
        int age;
        String address;

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
        @Override
        public String toString() {
            return name + " " + age + " " + address;
        }
    }
    public static class Woman{
        String name;
        int age;
        String address;

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
        @Override
        public String toString() {
            return name + " " + age + " " + address;
        }
    }

    //напишите тут ваш код
}
