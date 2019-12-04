package com.javarush.task.task02.task0207;

/* 
Кусочек калькулятора
*/
public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int a = 7, b = 8;
        System.out.println(printSum(a, b));
        System.out.println(printUmn(a, b));
    }

    public static int printSum(int a, int b){
        return a + b;
    }

    public static int printUmn(int a, int b){
        return a * b;
    }
}
