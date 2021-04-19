package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

/* 
Самая длинная строка
*/

public class Solution {
    private static ArrayList<String> strings = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            String value = bufferedReader.readLine();
            strings.add(value);
        }
        String maxString = strings.get(0) ;
        for (String string: strings) {
            if(string.length() > maxString.length()) maxString = string;
        }
        for (String string: strings) {
            if(string.length() == maxString.length()) System.out.println(string);
        }
    }
}