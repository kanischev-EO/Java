package com.javarush.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<String> firstList = new ArrayList();
        firstList.add("мама");
        firstList.add("мыла");
        firstList.add("раму");

        ArrayList<String> summary = new ArrayList<>();
        for (int i = 0; i < firstList.size() ; i++) {
            summary.add(firstList.get(i));
            summary.add("именно");
        }
        for (String value : summary) {
            System.out.println(value);
        }



    }
}
