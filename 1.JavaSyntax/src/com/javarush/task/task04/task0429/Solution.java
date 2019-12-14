package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] nums = new int[3];
        int countPlus = 0;
        int countMinus = 0;
        for (int i = 0; i <nums.length ; i++) {
            nums[i]=Integer.parseInt(bufferedReader.readLine());
            if (nums[i] >0) countPlus++;
            else if (nums[i] <0) countMinus++;
        }
        System.out.println("количество отрицательных чисел: " + countMinus);
        System.out.println("количество положительных чисел: " + countPlus);

    }
}
