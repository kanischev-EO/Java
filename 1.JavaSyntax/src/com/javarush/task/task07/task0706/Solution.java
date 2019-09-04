package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.BufferOverflowException;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int[] nums = new int[15];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(bf.readLine());
        }
        int evenHouseWithPeople = nums[0] + nums[2] + nums[4] + nums[6] + nums[8] + nums[10] + nums[12] + nums[14];
        int unevenHouseWithPeople = nums[1] + nums[3] + nums[5] + nums[7] + nums[9] + nums[11] + nums[13];
        if (evenHouseWithPeople > unevenHouseWithPeople) {
            System.out.print("В домах с четными номерами проживает больше жителей.");
        } else {
            System.out.print("В домах с нечетными номерами проживает больше жителей.");
        }
    }
}
