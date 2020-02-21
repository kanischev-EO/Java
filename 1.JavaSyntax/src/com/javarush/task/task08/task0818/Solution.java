package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        //напишите тут ваш код
        Map<String, Integer> map = new HashMap<>();
        map.put("Новиков", 15000);
        map.put("Мигунов", 2000);
        map.put("Васькин", 100);
        map.put("Шайкин", 8000);
        map.put("Дмитриев", 50);
        map.put("Иванов", 0);
        map.put("Гусар", 600);
        map.put("Бедов", 500);
        map.put("Ковалев", 499);
        map.put("Никонова", 501);
        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        //напишите тут ваш код
        HashMap<String, Integer> copy = new HashMap<>(map);
        for (Map.Entry<String, Integer> valueAndKey: copy.entrySet()) {
            if(valueAndKey.getValue()< 500) map.remove(valueAndKey.getKey());
        }
    }

    public static void main(String[] args) {

    }
}