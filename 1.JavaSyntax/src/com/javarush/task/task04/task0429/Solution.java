package com.javarush.task.task04.task0429;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Положительные и отрицательные числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int valueNum = 0;
        byte countPlus = 0;
        byte countMinus = 0;
        for (int i = 0; i < 3 ; i++) {
            valueNum = Integer.parseInt(bufferedReader.readLine());
            if(valueNum > 0) countPlus++;
            else countMinus++;
        }
        System.out.print("количество отрицательных чисел: " + countMinus +"\n" +
                "количество положительных чисел: " + countPlus);

    }
}
