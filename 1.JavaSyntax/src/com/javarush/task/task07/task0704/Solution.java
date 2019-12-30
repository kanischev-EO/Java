package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] value = new int[10];
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < value.length ; i++) {
            value[i] = Integer.parseInt(bufferedReader.readLine());
        }
        for (int i = value.length - 1; i >=0 ; i--) {
            System.out.println(value[i]);
        }
    }
}

