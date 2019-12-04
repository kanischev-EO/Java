package com.javarush.task.task01.task0140;

/* 
Выводим квадрат числа
*/

public class Solution {
    public static int number = 25;

    public static void main(String[] args) {
        //напишите тут ваш код
        System.out.println(printSquaredNumber(number));
    }

    private static int printSquaredNumber(int number) {
        return number * number;
    }
}