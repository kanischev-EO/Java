package com.javarush.task.task04.task0428;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Положительное число
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int one = Integer.parseInt(bufferedReader.readLine());
        int two = Integer.parseInt(bufferedReader.readLine());
        int three = Integer.parseInt(bufferedReader.readLine());
        byte count = 0;
        if(one > 0) count++;
        if(two > 0) count++;
        if(three > 0) count++;
        System.out.println(count);



    }
}
