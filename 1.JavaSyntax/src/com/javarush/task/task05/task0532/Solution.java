package com.javarush.task.task05.task0532;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Задача по алгоритмам Ӏ Java Syntax: 5 уровень, 12 лекция
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int oneN = Integer.parseInt(reader.readLine());
        int maxCount = 0;
        if(oneN> 0){
            for (int i = 0; i < oneN; i++) {
                int value = Integer.parseInt(reader.readLine());
                if(value > maxCount) maxCount = value;
            }
            System.out.println(maxCount);
        }

        //напишите тут ваш код

    }
}
