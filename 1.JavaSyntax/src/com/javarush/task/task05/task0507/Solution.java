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
        double countSum = 0;
        double count = 0;
        while (true){
            int enter = Integer.parseInt(bufferedReader.readLine());
            if (enter == -1){
                System.out.println(countSum /count);
                break;
            }
            count++;
            countSum+=enter;

        }
    }
}

