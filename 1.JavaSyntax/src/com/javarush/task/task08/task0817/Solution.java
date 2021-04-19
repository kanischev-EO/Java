package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Смирнов", "Роман");
        map.put("Иванов", "Дмитрий");
        map.put("Кузнецов", "Арнольд");
        map.put("Соколов", "Роман");
        map.put("Попов", "Максим");
        map.put("Лебедев", "Ярослав");
        map.put("Новиков", "Дмитрий");
        map.put("Козлов", "Дмитрий");
        map.put("Морозов", "Илья");
        map.put("Петров", "Максим");
        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
        Map<String, String> mapCopy = new HashMap<>(map);
        for (String name: mapCopy.values()) {
            int count = 0;
            for (String value: mapCopy.values() ) {
                if(value.equals(name)){
                    count++;
                }
            }
            if(count > 1){
                removeItemFromMapByValue(map,name);
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
        Map<String, String> map = createMap();
        removeTheFirstNameDuplicates(map);
        System.out.println(map.toString());


    }
}
