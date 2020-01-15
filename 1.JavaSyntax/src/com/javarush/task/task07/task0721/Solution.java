package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20 ; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        Collections.sort(list);

        int maximum = list.get(list.size()-1);
        int minimum = list.get(0);

        //напишите тут ваш код

        System.out.print(maximum + " " + minimum);
    }
}
