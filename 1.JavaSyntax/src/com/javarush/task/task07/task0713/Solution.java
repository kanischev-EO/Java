package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> integers = new ArrayList<>();
        ArrayList<Integer> integersDelit3 = new ArrayList<>();
        ArrayList<Integer> integersDelit2 = new ArrayList<>();
        ArrayList<Integer> integersDelitAll = new ArrayList<>();
        for (int i = 0; i < 20 ; i++) {
            int value = Integer.parseInt(bufferedReader.readLine());
            integers.add(value);
        }
        for (Integer value: integers) {
            if(value % 3 == 0 || value % 2 ==0){
                if(value % 3 == 0) {
                    integersDelit3.add(value);
                }else {
                    integersDelit2.add(value);
                }
            }else integersDelitAll.add(value);

        }
        //напишите тут ваш код
    }

    public static void printList(ArrayList<Integer> list) {
        //напишите тут ваш код
        for (Integer value : list) {
            System.out.println(value);
        }
    }
}
