package com.javarush.task.task08.task0827;

import java.util.Calendar;
import java.util.Date;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("February 6 2013"));
    }

    public static boolean isDateOdd(String date) {
        Date dateCurrent = new Date(date);
        Date dateStart = new Date(date);
        dateStart.setMonth(0);
        dateStart.setDate(1);
        long timeMS = dateCurrent.getTime() - dateStart.getTime();
        long days = (timeMS /(60 * 60 * 24 * 1000))+1;


        return days % 2 ==1;
    }
}
