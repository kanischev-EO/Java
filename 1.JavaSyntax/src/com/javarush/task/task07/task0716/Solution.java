package com.javarush.task.task07.task0716;

import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("ола");
        strings.add("зала");
        strings.add("мала");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        //напишите тут ваш код
        ArrayList<String> copyString = new ArrayList<>(strings);
        for (String value : copyString) {
            if (value.contains("р") && value.contains("л")) {
                continue;
            } else if (value.contains("р")) {
                strings.remove(value);
            } else if (value.contains("л")) {
                strings.add(value);
            }
        }
        return strings;


    }
}