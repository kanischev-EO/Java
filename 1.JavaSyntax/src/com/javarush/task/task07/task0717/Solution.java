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
        ArrayList<String> list = new ArrayList<>();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 3; i++) {
            list.add(bf.readLine());
        }

       list = doubleValues(list);

        for (String s : list) {
            System.out.println(s);
        }


        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }

        // Вывести на экран result
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        //напишите тут ваш код
        ArrayList<String> listNew = new ArrayList<>(list.size()*2);

        for (String s : list) {
            listNew.add(s);
            listNew.add(s);
        }

//        for (int i = 0; i <list.size() ; i= i+2) {
//            list.add(i,list.get(i));
//        }

        /*list.add(0,list.get(0));
        list.add(2,list.get(2));
        list.add(4,list.get(4));
        list.add(6,list.get(6));
        list.add(8,list.get(8));
        list.add(10,list.get(10));
        list.add(12,list.get(12));
        list.add(14,list.get(14));
        list.add(16,list.get(16));
        list.add(18,list.get(18));*/
        return listNew;
    }
}
