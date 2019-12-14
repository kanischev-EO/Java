package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] nums = new int[3];
        int count = 0;
        for (int i = 0; i <nums.length ; i++) {
            nums[i]=Integer.parseInt(bufferedReader.readLine());
            if (nums[i] >0) count++;
        }
        System.out.println(count);



    }
}
