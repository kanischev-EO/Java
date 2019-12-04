package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> myMap = new HashMap<>();
        myMap.put("Пупкин", "Геннадий");
        myMap.put("Самсонов", "Василий");
        myMap.put("Галкин", "Демид");
        myMap.put("Авдееж", "Евгений");
        myMap.put("Тулинов", "Иван");
        myMap.put("Джакоко", "Надежда");
        myMap.put("Авось", "Владимир");
        myMap.put("Принц", "Дмитрий");
        myMap.put("Сом", "Геннадий");
        myMap.put("Тупинов", "Валя");
        return myMap;

    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
        Map<String, String> myMap = new HashMap<>(map);
        int count = 0;
        String name = null;
        for (Map.Entry<String, String> entry: myMap.entrySet()) {
            String value = entry.getValue();
            for (Map.Entry<String, String> entry1: myMap.entrySet()) {
                if(entry1.getValue().equalsIgnoreCase(value)) {
                    count++;
                    name=entry1.getValue();
                }
                if(count>1) removeItemFromMapByValue(map, name);

            }

        }




    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {//удаление элемента по передаваемому значению
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
    }
}
