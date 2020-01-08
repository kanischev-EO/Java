package com.javarush.task.task08.task0812;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> valueForArrays = new ArrayList<>();
        int count = 1 ;
        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(bufferedReader.readLine()));
        }
        for (int i = 0; i < list.size() ; i++) {
            valueForArrays.add(i, 1);

        }
        for (int i = 0; i < list.size() - 1; i++) {
            if (i == list.size() - 1 ) break;
            if (list.get(i) == list.get(i + 1)) {
                int value = valueForArrays.get(count) + 1;
                valueForArrays.set(count,value);
            }else ++count;
        }
        Collections.sort(valueForArrays);
        int max = Collections.max(valueForArrays) > 1 ? Collections.max(valueForArrays) : 0;
        System.out.println(max);
    }
}