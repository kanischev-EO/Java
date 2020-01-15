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
        int[] numsBig = new int[20];
        int[] numsSmall1 = new int[10];
        int[] numsSmall2 = new int[10];

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < numsBig.length ; i++) {
            numsBig[i] = Integer.parseInt(bufferedReader.readLine());
        }
        numsSmall1 = Arrays.copyOf(numsBig,10);
        numsSmall2 = Arrays.copyOfRange(numsBig, 10, 20);
        System.out.println(Arrays.toString(numsSmall2));

    }
}
