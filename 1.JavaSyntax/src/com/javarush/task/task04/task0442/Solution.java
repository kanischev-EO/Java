package com.javarush.task.task04.task0442;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        while (true){
            int enter = Integer.parseInt(bufferedReader.readLine());
            count += enter;
            if(enter == -1) break;
        }
        System.out.println(count);

    }
}
