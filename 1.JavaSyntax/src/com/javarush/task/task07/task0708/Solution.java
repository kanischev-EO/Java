package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая длинная строка
*/

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        strings = new ArrayList<>();
        int sizeEnter = 0;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            String enter = bf.readLine();
            strings.add(enter);
            if(enter.length()>sizeEnter){
                sizeEnter = enter.length();
            }
        }
        for (String field : strings) {
            if(sizeEnter==field.length()){
                System.out.println(field);
            }
        }
    }
}