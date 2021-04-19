package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> strings = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5 ; i++) {
            strings.add(bufferedReader.readLine());
        }
        String minString =strings.get(0);
        for (String s: strings) {
            if(s.length()<minString.length()) minString = s;
        }
        for (String s: strings) {
            if(s.length() == minString.length()) System.out.println(s);
        }
    }
}
