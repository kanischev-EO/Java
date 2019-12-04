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
        for (int i = 0; i < 10; i++) {
            map.put("Кулаг" + i, i + 496);
        }
        return map;


    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        //напишите тут ваш код
        Map<String, Integer> mapCopy = new HashMap<>(map);
        for (Map.Entry<String, Integer> value : mapCopy.entrySet()) {
            Integer money = value.getValue();
            String key = value.getKey();
            if (money < 500) map.remove(key);
        }
    }

    public static void main(String[] args) {

    }
}