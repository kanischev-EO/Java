package com.javarush.task.task04.task0432;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Хорошего много не бывает
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String strings = bufferedReader.readLine();
        int nums = Integer.parseInt(bufferedReader.readLine());
        while (nums > 0) {
            System.out.println(strings);
            nums--;
        }

    }
}
