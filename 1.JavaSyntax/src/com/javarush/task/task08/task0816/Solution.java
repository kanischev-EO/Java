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
        map.put("Сталлоне", dateFormat.parse("November 21 2012"));
        map.put("Агапоне", dateFormat.parse("January 20 1975"));
        map.put("Агапоне", dateFormat.parse("January 21 1975"));
        map.put("Агапоне", dateFormat.parse("March 22 1975"));
        map.put("Агапоне", dateFormat.parse("December 23 1975"));
        map.put("Агапоне", dateFormat.parse("May 24 1975"));
        map.put("Агапоне", dateFormat.parse("January 24 1975"));
        map.put("Агапоне", dateFormat.parse("June 19 1975"));
        map.put("Агапоне", dateFormat.parse("August 24 1975"));
        map.put("Агапоне", dateFormat.parse("October 24 1975"));
        return map;

        //напишите тут ваш код
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        //напишите тут ваш код
        Map<String, Date> mapCopy = new HashMap<>();
        for (Map.Entry<String, Date> myMap: map.entrySet()) {
            Date value = myMap.getValue();

        }

    }

    public static void main(String[] args) {

    }
}
