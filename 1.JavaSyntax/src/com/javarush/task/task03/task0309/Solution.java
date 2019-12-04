package com.javarush.task.task03.task0309;

/* 
Сумма 5 чисел
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int numeral = 1;
        int saveSum = 0;
        for (int i = 1; i < 5; i++) {
            if (numeral == 1) {
                int sum = i;
                System.out.println(sum);
                numeral++;
                saveSum = sum;
                continue;
            }
            int sum = saveSum + i;
            System.out.println(sum);
            numeral++;
            saveSum = sum;


        }
    }
}
