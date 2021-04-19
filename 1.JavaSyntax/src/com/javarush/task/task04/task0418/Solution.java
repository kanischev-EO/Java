package com.javarush.task.task04.task0418;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Минимум двух чисел Ӏ Java Syntax: 4 уровень, 6 лекция
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count1 = Integer.parseInt(bufferedReader.readLine());
        int count2 = Integer.parseInt(bufferedReader.readLine());
        int min = count1 > count2 ? count2 : count1;
        System.out.println(min);


    }
}