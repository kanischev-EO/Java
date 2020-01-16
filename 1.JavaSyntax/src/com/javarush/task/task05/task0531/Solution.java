package com.javarush.task.task05.task0531;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Совершенствуем функциональность
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] nums = new int[5];
        for (int i = 0; i < nums.length ; i++) {
            nums[i]= Integer.parseInt(reader.readLine());
        }

        int minimum = min(nums[0], nums[1], nums[2], nums[3], nums[4]);

        System.out.println("Minimum = " + minimum);
    }


    public static int min(int a, int b, int c, int d, int e) {
        int[] nums = new int[5];
        nums[0] = a;
        nums[1] = b;
        nums[2] = c;
        nums[3] = d;
        nums[4] = e;
        Arrays.sort(nums);
        return nums[0];
    }
}
