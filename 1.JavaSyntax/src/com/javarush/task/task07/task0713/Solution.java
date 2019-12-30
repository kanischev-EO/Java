package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> mainList = new ArrayList<>();
        ArrayList<Integer> listDelite3 = new ArrayList<>();
        ArrayList<Integer> listDelite2 = new ArrayList<>();
        ArrayList<Integer> listDeliteAll = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            Integer value = Integer.parseInt(bufferedReader.readLine());
            mainList.add(value);
            if ((value % 3 == 0) && (value % 2 == 0)) {
                listDelite2.add(value);
                listDelite3.add(value);
            } else if (value % 3 == 0) listDelite3.add(value);
            else if (value % 2 == 0) listDelite2.add(value);
            else listDeliteAll.add(value);
        }
        printList(listDelite3);
        printList(listDelite2);
        printList(listDeliteAll);

    }

    public static void printList(ArrayList<Integer> list) {
        //напишите тут ваш код
        for (Integer value : list) {
            System.out.println(value);
        }
    }
}
