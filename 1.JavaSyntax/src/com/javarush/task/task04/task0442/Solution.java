package com.javarush.task.task04.task0442;

/* 
Суммирование
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int count = 0;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int a = Integer.parseInt(bufferedReader.readLine());
            count+=a;
            if (a < 0) break;

        }
        System.out.print(count);
    }
}