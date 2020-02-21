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
    int maxValue= 0;
    if(currentValue> 0){
        for (int i = 0; i < currentValue; i++) {
            int enter = Integer.parseInt(reader.readLine());
            if(enter>maxValue) maxValue = enter;
        }
        System.out.println(maxValue);

}}}