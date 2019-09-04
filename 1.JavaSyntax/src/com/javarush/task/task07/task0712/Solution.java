package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        List<String> list = new ArrayList<>();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;
        int min = 0;
        int indexMaxValue = 0;
        int indexMinValue = 0;
        for (int i = 0; i < 10; i++) {
            String enter = bf.readLine();
            list.add(enter);
            if (i == 0) {
                min = enter.length();
                indexMinValue = i;
                max = enter.length();
                indexMaxValue = i;
            }
            if (enter.length() > max) {
                max = enter.length();
                indexMaxValue = i;
            } else if (enter.length() < min) {
                min = enter.length();
                indexMinValue = i;
            }
        }
        System.out.println(list.get(Math.min(indexMaxValue, indexMinValue)));
    }
}
