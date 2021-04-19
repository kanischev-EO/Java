package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < 10 ; i++) {
            strings.add(bufferedReader.readLine());
        }
        for (int i = 0; i < strings.size()-1 ; i++) {
            String value1 = strings.get(i);
            String value2 = strings.get(i + 1);
            if(value2.length()> value1.length()){
                System.out.println(strings.indexOf(value2));
            }
        }
    }
}

