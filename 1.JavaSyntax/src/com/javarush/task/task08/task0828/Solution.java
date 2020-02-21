package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String month = bufferedReader.readLine();
        Map<String, Integer > seasons = new HashMap<>();
        seasons.put("january", 1);
        seasons.put("february", 2);
        seasons.put("march", 3);
        seasons.put("april", 4);
        seasons.put("may", 5);
        seasons.put("june", 6);
        seasons.put("july", 7);
        seasons.put("august", 8);
        seasons.put("september", 9);
        seasons.put("october", 10);
        seasons.put("november", 11);
        seasons.put("december", 12);
        System.out.println( month +" is the " + seasons.get(month) + " month");
    }
}
