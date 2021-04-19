package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        SimpleDateFormat outputFormat = new SimpleDateFormat("MMM d,yyyy",Locale.ENGLISH);
        SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-d");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String value = bufferedReader.readLine();
        Date date =inputFormat.parse(value);
        System.out.println(outputFormat.format(date).toUpperCase());
    }
}
