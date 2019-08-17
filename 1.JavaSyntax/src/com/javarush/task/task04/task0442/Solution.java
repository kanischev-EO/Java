package com.javarush.task.task04.task0442;

/* 
Суммирование
*/

import java.io.*;
import java.util.*;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;

        for (int i = 0; i < 10; i++) {
            int a = Integer.parseInt(bf.readLine());
            count += a;
            if (a == -1) {
                System.out.print(count);
                break;

            }
        }
    }
}