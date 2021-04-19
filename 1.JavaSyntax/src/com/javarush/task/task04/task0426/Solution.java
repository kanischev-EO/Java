package com.javarush.task.task04.task0426;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Ярлыки и числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bufferedReader.readLine());
        if (num == 0) System.out.print("ноль");
        if(num % 2 == 0 && num != 0){
            if (num > 0) System.out.print("положительное четное число");
            else System.out.print("отрицательное четное число");
        } else if (num % 2 != 0 && num != 0) {
            if (num > 0) System.out.print("положительное нечетное число");
            else System.out.print("отрицательное нечетное число");
        }

    }
}
