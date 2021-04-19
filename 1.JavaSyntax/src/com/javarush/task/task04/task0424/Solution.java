package com.javarush.task.task04.task0424;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Три числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int one = Integer.parseInt(bufferedReader.readLine());
        int two = Integer.parseInt(bufferedReader.readLine());
        int three = Integer.parseInt(bufferedReader.readLine());
        if(one != two && one != three ) System.out.print("1");
        else if(two != one && two != three ) System.out.print("2");
        else if(three != one && three != two ) System.out.print("3");

    }
}
