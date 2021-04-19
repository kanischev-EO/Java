package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Integer value;
        List<Integer> list = new ArrayList<>();
        while(true){
            try {
                value = Integer.parseInt(bufferedReader.readLine());
                list.add(value);
            } catch (Exception e){
                for (Integer integer : list) {
                    System.out.println(integer);
                }
            }
        }
    }
}
