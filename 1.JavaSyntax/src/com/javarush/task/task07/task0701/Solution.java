package com.javarush.task.task07.task0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Массивный максимум
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        // создай и заполни массив
        int[] nums = new int[20];
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(bufferedReader.readLine());
        }
        return nums;
    }

    public static int max(int[] array) {
        // найди максимальное значение
        Arrays.sort(array);
        return array[array.length-1];
    }
}
