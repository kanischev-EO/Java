package com.javarush.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удваиваем слова
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // Считать строки с консоли и объявить ArrayList list тут
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10 ; i++) {
            list.add(bufferedReader.readLine());
        }
        ArrayList<String> result = doubleValues(list);

        // Вывести на экран result
        for (String enter : result) {
            System.out.println(enter);
        }


    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        //напишите тут ваш код
        ArrayList<String> copyList = new ArrayList<>();
        for (String value : list) {
            copyList.add(value);
            copyList.add(value);

        }
        return copyList;
    }
}
