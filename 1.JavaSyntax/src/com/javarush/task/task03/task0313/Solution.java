package com.javarush.task.task03.task0313;

/* 
Мама мыла раму
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        String[] names = {"Мама", "Мыла", "Раму"};
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + names[1] + names[2]);
            System.out.println(names[2] + names[i] + names[1]);

        }

    }
}
