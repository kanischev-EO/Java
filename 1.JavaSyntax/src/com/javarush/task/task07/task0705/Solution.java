package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] nums = new int[20];
        for (int i = 0; i < nums.length ; i++) {
            nums[i] = Integer.parseInt(bufferedReader.readLine());
        }
        int[] smallNums1 = Arrays.copyOfRange(nums,0,10) ;
        int[] smallNums2 = Arrays.copyOfRange(nums,10,20);
        System.out.println(Arrays.toString(smallNums2));

    }
}
