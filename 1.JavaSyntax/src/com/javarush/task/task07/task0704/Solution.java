package com.javarush.task.task07.task0704;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(rd.readLine());
        }
       for (int j = nums.length -1;j > 0;j--) System.out.println(nums[j]);
    }
}

