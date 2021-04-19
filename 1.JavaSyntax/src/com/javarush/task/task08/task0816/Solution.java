package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Смирнов", dateFormat.parse("MAY 1 2012"));
        map.put("Иванов", dateFormat.parse("JUNE 1 2012"));
        map.put("Кузнецов", dateFormat.parse("JULY 1 2012"));
        map.put("Соколов", dateFormat.parse("AUGUST 1 2012"));
        map.put("Попов", dateFormat.parse("SEPTEMBER 1 2012"));
        map.put("Лебедев", dateFormat.parse("MAY 1 2012"));
        map.put("Новиков", dateFormat.parse("JUNE 1 2012"));
        map.put("Козлов", dateFormat.parse("JUNE 1 2012"));
        map.put("Морозов", dateFormat.parse("JUNE 1 2012"));
        map.put("Петров", dateFormat.parse("JUNE 1 2012"));
        return map;

        //напишите тут ваш код
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        //напишите тут ваш код
        Map<String, Date> mapCopy = new HashMap<>(map);
        for (Map.Entry<String, Date> value: mapCopy.entrySet()) {
            int month = value.getValue().getMonth() + 1;
            if(month == 6 || month ==7 || month == 8){
                map.remove(value.getKey());
            }
        }


    }

    public static void main(String[] args) throws Exception {
        Map<String, Date> map = createMap();
        removeAllSummerPeople(map);
        System.out.println(map.toString());

    }
}
