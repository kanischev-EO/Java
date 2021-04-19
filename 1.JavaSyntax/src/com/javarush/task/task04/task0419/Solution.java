package com.javarush.task.task04.task0419;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Максимум четырех чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count1 = Integer.parseInt(bufferedReader.readLine());
        int count2 = Integer.parseInt(bufferedReader.readLine());
        int count3 = Integer.parseInt(bufferedReader.readLine());
        int count4 = Integer.parseInt(bufferedReader.readLine());
        int max1 = count1 > count2 ? count1 : count2;
        int max2 = count3 > count4 ? count3 : count4;
        int maxForTwoNumber = max1 > max2 ? max1 : max2;
        System.out.println(maxForTwoNumber);

    }
}
