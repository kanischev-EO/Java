package com.javarush.task.task04.task0427;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Описываем числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(bufferedReader.readLine());
        if(number>0 && number<=9){
            if(number % 2 ==0) System.out.print("четное однозначное число");
            else System.out.print("нечетное однозначное число");
        } else if (number>=10 && number<=99){
            if(number % 2 ==0) System.out.print("четное двузначное число");
            else System.out.print("нечетное двузначное число");
        } else if(number>=100 && number<= 999){
            if(number % 2 ==0) System.out.print("четное трехзначное число");
            else System.out.print("нечетное трехзначное число");
        }

    }
}
