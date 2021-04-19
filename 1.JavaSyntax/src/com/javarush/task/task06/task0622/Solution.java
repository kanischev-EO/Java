package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] nums = new int[5];
        for (int i = 0; i < 5; i++) {
            nums[i] = Integer.parseInt(reader.readLine());
        }
        for (int i = 0; i < nums.length - 1 ; i++) {
            for (int j = i; j < nums.length ; j++) {
                if(nums[i] > nums[j]){
                    swap(nums,i,j );
                }
            }
        }
        for (int i = 0; i < nums.length ; i++) {
            System.out.println(nums[i]);
        }


        //напишите тут ваш код
    }
    public static void swap(int[] nums, int indexOne , int indexTwo){
        int c = nums[indexOne];
        nums[indexOne] = nums[indexTwo];
        nums[indexTwo] = c;

    }
}
