package com.javarush.task.task04.task0433;

/* 
Гадание на долларовый счет
*/

public class Solution {
    public static void main(String[] args) {
        int count = 0;
        int jCount = 0;
        while (count < 10) {
            while (jCount < 10) {
                System.out.print("S");
                jCount++;
            }
            jCount = 0;
            count++;
            System.out.println();

        }

    }
}
