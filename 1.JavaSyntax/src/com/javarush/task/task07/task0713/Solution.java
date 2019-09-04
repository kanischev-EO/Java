package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> listDeletOn3 = new ArrayList<>();
        ArrayList<Integer> listDeletOn2 = new ArrayList<>();
        ArrayList<Integer> listDeletAllDelet = new ArrayList<>();
        for (int i = 0; i <20 ; i++) {
            Integer enter = Integer.parseInt(bf.readLine());
            list.add(enter);
            if(enter %3==0){
                listDeletOn3.add(enter);

            }else if((enter%2==0) && (enter %3==0)) {
                listDeletOn2.add(enter);
                listDeletOn3.add(enter);
            }
            if(enter %2==0) {
                listDeletOn2.add(enter);

            }else if(!(enter %3==0 ) && !(enter%2==0)){
                listDeletAllDelet.add(enter);
            }
        }
        printList(listDeletOn3);
        printList(listDeletOn2);
        printList(listDeletAllDelet);

    }

    public static void printList(ArrayList<Integer> list) {
        //напишите тут ваш код
        for (Integer x: list) {
            System.out.println(x);

        }
    }
}
