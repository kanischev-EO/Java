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
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] nums = new int[15];
        int humanEven = 0;
        int humanOdd = 0;

        for (int i = 0; i < nums.length ; i++) {
            nums[i] = Integer.parseInt(bufferedReader.readLine());
            if(i % 2 ==0) humanEven+=nums[i];
            else humanOdd+=nums[i];
        }
        String value = humanEven > humanOdd ?"В домах с четными номерами проживает больше жителей."
                :"В домах с нечетными номерами проживает больше жителей.";
        System.out.println(value);

    }
}
