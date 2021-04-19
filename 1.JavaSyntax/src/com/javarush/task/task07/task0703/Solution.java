package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] strings = new String[10];
        int[] nums = new int[10];
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            strings[i] = bufferedReader.readLine();
            nums[i] = strings[i].length();
        }
        System.out.println(Arrays.toString(nums));
        //напишите тут ваш код
    }
}
