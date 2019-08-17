package com.javarush.task.task05.task0532;

import java.io.*;
import java.io.BufferedReader;

/* 
Задача по алгоритмам
*/

public class Solution
{
    public static void main(String[] args) throws Exception{
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int currentValue = Integer.parseInt(reader.readLine());
    int maximum = 0;
        for (int i = 0;currentValue >0;i++){
            if(i == maximum) maximum = currentValue;

           else if (currentValue > maximum) maximum = currentValue;
            System.out.print(maximum);
        }
    }
}