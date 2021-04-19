package com.javarush.task.task07.task0728;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.util.Arrays.*;

/* 
В убывающем порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        for (int x : array) {
            System.out.println(x);
        }
    }

    public static void sort(int[] array) {
        //напишите тут ваш код
//        Arrays.sort(array);
//        ArrayList<Integer> integers = new ArrayList<>();
//        for (int i = 0; i < array.length ; i++) {
//            integers.add(array[i]);
//        }
//        Collections.reverse(integers);
//        for (int i = 0; i < array.length ; i++) {
//            array[i] = integers.get(i);
//        }
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if(array[i] < array[j]){
                    int c = array[j];
                    array[j] = array[i];
                    array[i] = c;
                }
            }
        }

}}
