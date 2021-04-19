package com.javarush.task.task05.task0507;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Среднее арифметическое
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        float sum = 0;
        while (true){
            int valueEnter = Integer.parseInt(bufferedReader.readLine());
            if(valueEnter ==-1){
                System.out.println(sum/count);
                break;
            }
            count++;
            sum+= valueEnter;
        }
    }
}

