package com.javarush.task.task08.task0827;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("JANUARY 1 2020"));
    }

    public static boolean isDateOdd(String date) {
        Date dateNow = new Date(date);
        Date dateOld = new Date(dateNow.getYear(), 0,0);
        long differenceDate = (dateNow.getTime() - dateOld.getTime()) / (1000 * 60 * 60 * 24);
        return differenceDate % 2 == 0 ? false : true ;
    }
}