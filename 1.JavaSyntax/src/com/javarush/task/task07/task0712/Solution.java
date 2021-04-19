package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            strings.add(bufferedReader.readLine());
        }
        String maxString = strings.get(0);
        String minString = strings.get(0);
        for (String s:strings) {
            if(s.length()>maxString.length()) maxString = s;
            if(s.length()<minString.length()) minString = s;
        }
        System.out.println(strings.indexOf(maxString)> strings.indexOf(minString)?minString : maxString );
    }
}
