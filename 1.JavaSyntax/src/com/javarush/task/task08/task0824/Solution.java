package com.javarush.task.task08.task0824;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* 
Собираем семейство
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human oneChildren = new Human("Женя", true, 25);
        Human twoChildren = new Human("Николай", true, 32);
        Human threeChildren = new Human("Жанна", false, 17);
        Human father = new Human("Олег", true, 52, oneChildren, twoChildren);
        Human mother = new Human("Cветлана", false, 52, threeChildren);
        Human grandFather1 = new Human("Иван", true, 81, father);
        Human grandFather2 = new Human("Петя", true, 80, mother);
        Human grandMother1 = new Human("Олеся", false, 76, father);
        Human grandMother2 = new Human("Татьяна", false, 75, mother);
        System.out.println(oneChildren);
        System.out.println(twoChildren);
        System.out.println(threeChildren);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(grandFather1);
        System.out.println(grandFather2);
        System.out.println(grandMother1);
        System.out.println(grandMother2);
    }

    public static class Human {
        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human... children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            Collections.addAll(this.children, children);
        }

        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
       List<Human> children = new ArrayList<>();

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
