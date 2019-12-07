package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int value1 =Integer.parseInt(bufferedReader.readLine());
        int value2 =Integer.parseInt(bufferedReader.readLine());
        if(value1 > value2) System.out.println(value2);
        else if (value1 == value2) System.out.println(value1);
        else System.out.println(value1);

    }
}