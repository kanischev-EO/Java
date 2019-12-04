package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        int counter = 1;
        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(bf.readLine()));
        }
        for (int i = 0; i < list.size()-1; i++) {
            int count = 1;
            for (int j = i+1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    count++;
                }
                else break;
            }
            if (count > counter)
                counter = count;
        }
        System.out.println(counter);
        }






    }
