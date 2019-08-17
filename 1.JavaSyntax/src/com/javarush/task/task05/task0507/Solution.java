package com.javarush.task.task05.task0507;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Среднее арифметическое
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0, count = 0;
        while (true){
            int a =Integer.parseInt(bf.readLine());


            if(a == -1){
                double sr= sum *1. / count;
                System.out.println(sr);

            }
            count++;
            sum+=a;
        }
    }
}

