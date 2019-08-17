package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Man man1 = new Man("Zep", 30, "VIVIVIV89");
        Man man2 = new Man("Zed", 31, "VIVIVIV82");
        Woman woman1 = new Woman("Zoy", 32, "fwfwfqwef13");
        Woman woman2 = new Woman("Zay", 33, "fwfwfqwef12");
        System.out.println(man1.name + " " + man1.age + " " + man1.address);
        System.out.println(man2.name + " " + man2.age + " " + man2.address);
        System.out.println(woman1.name + " " + woman1.age + " " + woman1.address);
        System.out.println(woman2.name + " " + woman2.age + " " + woman2.address);

    }

    public static class Man {
        String name, address;
        int age;

        public Man(String name, int age, String address) {
            this.address = address;
            this.age = age;
            this.name = name;
        }
    }


    public static class Woman {
        String name, address;
        int age;

        public Woman(String name, int age, String address) {
            this.address = address;
            this.age = age;
            this.name = name;
        }
    }
}
