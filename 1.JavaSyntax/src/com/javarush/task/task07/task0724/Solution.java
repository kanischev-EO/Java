package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        Human h1 = new Human("Acя", true, 21);
        Human h2 = new Human("ВAcя", false, 22);
        Human h3 = new Human("NAcя", true, 23);
        Human h4 = new Human("UAcя", false, 24);
        Human j1 = new Human("ТАСЯ", false,36,h1,h2);
        Human j2 = new Human("aaАСЯ", false,36,h3,h4);
        Human j3 = new Human("wАСЯ", false,36,h1,h2);
        Human j4 = new Human(",lАСЯ", false,36,h3,h4);
        Human j5 = new Human("aАСЯ", false,36,h1,h2);
        System.out.println(h1.toString());
        System.out.println(h2.toString());
        System.out.println(h3.toString());
        System.out.println(h4.toString());
        System.out.println(j1.toString());
        System.out.println(j2.toString());
        System.out.println(j3.toString());
        System.out.println(j4.toString());
        System.out.println(j5.toString());
    }

    public static class Human {
        // напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}