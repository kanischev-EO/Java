package com.javarush.task.task08.task0817;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> mapa = new HashMap<>();
        mapa.put("Новиков", "Евгений");
        mapa.put("Мигунов", "Андрей");
        mapa.put("Васькин", "Андрей");
        mapa.put("Шайкин", "Евгений");
        mapa.put("Дмитриев", "Евгений");
        mapa.put("Иванов", "Евгений");
        mapa.put("Гусар", "Олег");
        mapa.put("Бедов", "Олег");
        mapa.put("Ковалев", "Максим");
        mapa.put("Никонова", "Светлана");
        return mapa;


    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код

//        ArrayList<String> listNames = new ArrayList<>(map.values());
////
////        for (int i = 0; i < listNames.size()-1;i++) {
////            String name = listNames.get(i);
////            for (int j = i + 1; j < listNames.size(); j++) {
////                if(listNames.get(j).equalsIgnoreCase(name)){
////                    removeItemFromMapByValue(map, name);
////                }
////            }
////        }
        Map<String, Integer> mapFirstNameCount = new HashMap<>();
        for (String firstName : map.values()) {
            Integer nameCounts = mapFirstNameCount.getOrDefault(firstName, 0);
            mapFirstNameCount.put(firstName, ++nameCounts);
        }

        for (Map.Entry<String, Integer> entry : mapFirstNameCount.entrySet()) {
            if (entry.getValue() > 1) {
                removeItemFromMapByValue(map, entry.getKey());
            }
        }



    }


    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
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
