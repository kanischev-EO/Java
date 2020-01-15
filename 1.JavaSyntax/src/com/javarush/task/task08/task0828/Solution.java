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
        seasons.put("January", 1);
        seasons.put("February", 2);
        seasons.put("March", 3);
        seasons.put("April", 4);
        seasons.put("May", 5);
        seasons.put("June", 6);
        seasons.put("July", 7);
        seasons.put("August", 8);
        seasons.put("September", 9);
        seasons.put("October", 10);
        seasons.put("November", 11);
        seasons.put("December", 12);
        System.out.println( month +" is the " + seasons.get(month) + " month");
    }
}
