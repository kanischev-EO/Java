package com.javarush.task.task06.task0611;

/* 
Класс StringHelper
*/

public class StringHelper {
    public static String multiply(String text) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            stringBuilder.append(text);
        }
        //напишите тут ваш код
        return stringBuilder.toString();
    }

    public static String multiply(String text, int count) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < count; i++) {
            stringBuilder.append(text);
        }
        //напишите тут ваш код
        return stringBuilder.toString();
    }

    public static void main(String[] args) {


    }
}
