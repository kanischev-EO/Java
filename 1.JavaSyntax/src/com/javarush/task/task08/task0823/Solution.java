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
        String enter = reader.readLine();
        String[] newEnter = enter.split(" ");
        for (String word : newEnter) {
            char[] chars = word.toCharArray();
            String unchar = chars[0] + "";
            String up_inchar = unchar.toUpperCase();
            StringBuilder strbr = new StringBuilder(word);
            strbr.deleteCharAt(0);
            System.out.print(up_inchar + strbr + " ");
        }

    }


    //напишите тут ваш код
}

