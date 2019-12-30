package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        int[] nums = new int[15];
        int countEven = 0;//четное
        int countOdd = 0;// нечетное

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(bufferedReader.readLine());
            if (i % 2 == 0 || i == 0) countEven += nums[i];
            else countOdd += nums[i];
        }
        String value = countEven > countOdd ? "В домах с четными номерами проживает больше жителей." :
                "В домах с нечетными номерами проживает больше жителей.";
        System.out.println(value);
    }
}
