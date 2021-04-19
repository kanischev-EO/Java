package com.javarush.task.task05.task0531;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Совершенствуем функциональность
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       int[] nums = new int[5];
        for (int i = 0; i < 5; i++) {
            nums[i] = Integer.parseInt(reader.readLine());
        }
        int minimimFour = minFourNums(nums[0],nums[1],nums[2],nums[3]);
        int minimumFive = minTwoNums(minimimFour, nums[4]);

        System.out.println("Minimum = " + minimumFive);
    }
    public static int minFourNums(int a, int b, int c, int d){
        return minTwoNums(a, b)> minTwoNums(c,d)? minTwoNums(c, d) : minTwoNums(a, b);
    }


    public static int minTwoNums(int a, int b) {
        return a < b ? a : b;
    }
}
