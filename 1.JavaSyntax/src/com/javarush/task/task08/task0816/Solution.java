package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Сталлоне", dateFormat.parse("MAY 1 1995"));
        map.put("Ковальски", dateFormat.parse("July 1 1996"));
        map.put("Авджез", dateFormat.parse("June 1 1997"));
        map.put("Канищев", dateFormat.parse("NOVEMBER 1 1998"));
        map.put("Иванова", dateFormat.parse("DECEMBER 1 1999"));
        map.put("Скарина", dateFormat.parse("APRIL 1 2000"));
        map.put("Горгидзе", dateFormat.parse("SEPTEMBER 1 2001"));
        map.put("Ганапиев", dateFormat.parse("OCTOBER 1 2002"));
        map.put("Улюкаев", dateFormat.parse("NOVEMBER 1 2003"));
        map.put("Путин", dateFormat.parse("August 1 2003"));
        return map;

        //напишите тут ваш код
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        //напишите тут ваш код
        Map<String, Date> allPeople = new HashMap<>(map);
        for (Map.Entry<String, Date> people : allPeople.entrySet()) {
            Date date =  people.getValue();
            if(date.getMonth()== 6 || date.getMonth()== 7 || date.getMonth()== 8  ){
                map.remove(people.getKey());
            }
        }

    }

    public static void main(String[] args) {

    }
}
