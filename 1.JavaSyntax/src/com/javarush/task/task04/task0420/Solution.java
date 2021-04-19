package com.javarush.task.task04.task0420;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Сортировка трех чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int one = Integer.parseInt(bufferedReader.readLine());
        int two = Integer.parseInt(bufferedReader.readLine());
        int three = Integer.parseInt(bufferedReader.readLine());
        if (one > two && one > three) {
            System.out.print(one + " ");
            if (two > three) {
                System.out.print(two + " ");
                System.out.print(three + " ");
            } else {
                System.out.print(three + " ");
                System.out.print(two + " ");
            }
        } else if (two > one && two > three) {
            System.out.print(two + " ");
            if (one > three) {
                System.out.print(one + " ");
                System.out.print(three + " ");
            } else {
                System.out.println(three + " ");
                System.out.println(one + " ");
            }
        } else if (three > one && three > two) {
            System.out.print(three + " ");
            if (one > two) {
                System.out.print(one + " ");
                System.out.print(two + " ");
            } else {
                System.out.print(two + " ");
                System.out.print(one + " ");
            }
        }
    }
}
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//int[] nums = new int[3];
//        for (int i = 0; i < 3; i++) {
//            nums[i] = Integer.parseInt(bufferedReader.readLine());
//        }
//        Arrays.sort(nums);
//        for (int i = 2; i >= 0; i--) {
//            System.out.print(nums[i] + " ");
//        }}}


