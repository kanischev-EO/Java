package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String enter;
        int sum = 0;
        while (!(enter=bufferedReader.readLine()).equals("сумма")){
            sum+=Integer.parseInt(enter);
        }
        System.out.println(sum);


    }
}
