package com.javarush.task.task07.task0716;

import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        //напишите тут ваш код
        ArrayList<String> res = new ArrayList<>();
        for (String s : strings)
        {
            if(s.contains("р") && s.contains("л")){
                res.add(s);
            } else if(s.contains("р")){
                continue;
            } else if(s.contains("л")){
                res.add(s);
                res.add(s);
            } else {
                res.add(s);
            }
        }
        return res;
    }}