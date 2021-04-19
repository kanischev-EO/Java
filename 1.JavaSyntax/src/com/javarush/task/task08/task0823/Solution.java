package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
//        String[] splitString =string.split(" ");
//        StringBuilder stringBuilder = new StringBuilder();
//        for (String str : splitString) {
//            char[] chars = str.toCharArray();
//            chars[0] =Character.toUpperCase(chars[0]);
//            stringBuilder.append(String.valueOf(chars)+" ");
//        }
//        System.out.println(stringBuilder);
        StringBuilder stringBuilder = new StringBuilder();
        char[] characters = string.toCharArray();
        characters[0] = Character.toUpperCase(characters[0]);
        for (int i = 0; i < characters.length; i++) {
            Character value = characters[i];
            if(value.equals(' ')){
                characters[i+1] = Character.toUpperCase(characters[i+1]);
            }
        }
        stringBuilder.append(characters);
        System.out.println(stringBuilder);






        //напишите тут ваш код
    }
}
