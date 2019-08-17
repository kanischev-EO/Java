package com.javarush.task.task06.task0606;

import java.io.*;
import java.io.InputStreamReader;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String word = reader.readLine();
        int num = Integer.parseInt(word);
        while (num > 0) {
            if (num % 2 == 0) {
                even++;
            } else if (num % 2 != 0) {
                odd++;
            }
            num/=10;
        }
        System.out.println("Even:" + " " + even + " Odd:" + " " + odd);
    }}
