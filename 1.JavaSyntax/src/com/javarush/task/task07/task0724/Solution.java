package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        Human grandfather1 = new Human("дед Василий",true, 63);
        Human grandfather2 = new Human("дед Антон",true, 67);
        Human grandmother1 = new Human("баба Катя",false, 52);
        Human grandmother2 = new Human("баба Надя",false, 55);
        Human father = new Human("Олег", true, 52, grandfather1,grandmother1);
        Human mother = new Human("Светлана", false, 52, grandfather1,grandmother1);
        Human son1 = new Human("Антон", true, 17,father,mother);
        Human son2 = new Human("Валя", true, 13,father,mother);
        Human son3 = new Human("Саня", true, 22,father,mother);
        System.out.println(grandfather1);
        System.out.println(grandfather2);
        System.out.println(grandmother1);
        System.out.println(grandmother2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(son1);
        System.out.println(son2);
        System.out.println(son3);
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