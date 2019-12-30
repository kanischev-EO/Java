package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        strings = new ArrayList<>();
        int minSizeStrings = 0;
        String valueMinSizeStrings = null;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            strings.add(bufferedReader.readLine());
        }
        for (String value : strings) {
            if (value.length() < minSizeStrings || minSizeStrings == 0) {
                minSizeStrings = value.length();
                valueMinSizeStrings = value;
            } else if (value.length() == minSizeStrings) {
                valueMinSizeStrings += "\n" + value;
            }
        }
        System.out.println(valueMinSizeStrings);
    }
}
