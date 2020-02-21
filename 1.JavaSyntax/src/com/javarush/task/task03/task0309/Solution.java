package com.javarush.task.task03.task0309;

/* 
Сумма 5 чисел
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int saveSum = 0;
        for (int i = 1; i < 10; i++) {
            if (i == 1) {
                System.out.println(i);
                saveSum = i;
                continue;
            }
            int sum = saveSum + i;
            System.out.println(sum);
            saveSum = sum;


        }
    }
}
