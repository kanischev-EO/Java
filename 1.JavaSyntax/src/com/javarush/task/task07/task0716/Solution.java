package com.javarush.task.task07.task0716;

import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лира");
        strings.add("лоза");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        //напишите тут ваш код
        ArrayList<String> copyStrings = new ArrayList<>(strings);
        for (String value : copyStrings) {
            if(value.contains("р") && value.contains("л")) continue;
            else if (value.contains("р")) strings.remove(value);
            else if (value.contains("л")) strings.add(value);
        }
        return strings;
    }
}