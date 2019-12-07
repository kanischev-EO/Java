package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        double value = Double.parseDouble(bufferedReader.readLine());
        double t = value % 5;


        if (t < 3) {
            System.out.println("зелёный");
        }

        if (t >= 3 && t < 4) {
            System.out.println("жёлтый");
        }
        if (t >= 4 && t < 5) {
            System.out.println("красный");
        }
    }
}