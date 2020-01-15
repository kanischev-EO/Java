package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String stData = bufferedReader.readLine();
        String[] split = stData.split("-"); 
        int year = Integer.parseInt(split[0]);
        int month = Integer.parseInt(split[1])-1;
        int day = Integer.parseInt(split[2]);
        GregorianCalendar date = new GregorianCalendar(year,month,day);
        Date date1 = date.getTime();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMM d, yyyy", Locale.ENGLISH);
        System.out.println(simpleDateFormat.format(date1).toUpperCase());
    }
}
