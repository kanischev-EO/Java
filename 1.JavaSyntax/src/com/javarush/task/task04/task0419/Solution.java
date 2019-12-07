package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int value1 = Integer.parseInt(bufferedReader.readLine());
        int value2 = Integer.parseInt(bufferedReader.readLine());
        int value3 = Integer.parseInt(bufferedReader.readLine());
        int value4 = Integer.parseInt(bufferedReader.readLine());
        int min1 = Math.min(value1, value2);
        int min2 = Math.min(value3, value4);
        if (min1 > min2) System.out.println(min2);
        else System.out.println(min1);

    }
}
