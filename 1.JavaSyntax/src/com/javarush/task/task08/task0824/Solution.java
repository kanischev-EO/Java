package com.javarush.task.task08.task0824;

import java.util.ArrayList;
import java.util.Arrays;

/* 
Собираем семейство
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human child1 = new Human("Антошка", true, 12);
        Human child2 = new Human("Cашенька", false, 13);
        Human child3 = new Human("Cережа", true, 12);
        Human mother = new Human("Светлана", false, 29, new Human[]{child1,child2,child3});
        Human father = new Human("Анатолий", true, 30,new Human[]{child1, child2, child3});
        Human grandfather1 = new Human("Василий", true, 64, new Human[]{father});
        Human grandfather2 = new Human("Генадий", true, 70,new Human[]{mother});
        Human grandmother = new Human("Людмила", false, 70,new Human[]{father});
        Human grandmother2 = new Human("Татьяна", false, 70,new Human[]{mother});

        ArrayList<Human> people = new ArrayList<Human>(Arrays.asList(grandfather1,grandfather2, grandmother,grandmother2, father , mother, child1, child2, child3 ));
        for (Human man : people) {
            System.out.println(man);
        }

    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human(String name) {
            this.name = name;
        }

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = new ArrayList<>(0);
        }
        public Human(String name, boolean sex, int age,Human[] human ) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = new ArrayList<Human>();
            for (Human childPeople : human) {
                this.children.add(childPeople);

            }


        }

        public Human(String name, boolean sex, int age, String[] child) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = new ArrayList<Human>();
            for (String childPeople : child) {
                this.children.add(new Human(childPeople));

            }

        }

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
