package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        List<String> seasons = new ArrayList<>();
        seasons.add("January");
        seasons.add("February");
        seasons.add("March");
        seasons.add("April");
        seasons.add("May");
        seasons.add("June");
        seasons.add("July");
        seasons.add("August");
        seasons.add("September");
        seasons.add("October");
        seasons.add("November");
        seasons.add("December");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String keyMonth = bufferedReader.readLine();

           if(seasons.contains(keyMonth)){
               int index = seasons.indexOf(keyMonth) + 1;
               System.out.println(keyMonth + " is the " + index + " month ");
           }


    }
}
