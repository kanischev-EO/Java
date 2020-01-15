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
        List<Integer> list = new ArrayList<>();
        try {
            while (true){
                int value = Integer.parseInt(bufferedReader.readLine());
                list.add(value);
            }
        } catch (NumberFormatException e) {
            for (Integer value : list) {
                System.out.println(value);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
