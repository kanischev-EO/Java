package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> lastNameMap = new HashMap<>();
        lastNameMap.put("Иванов", "Михаил");
        lastNameMap.put("Канищев", "Евгений");
        lastNameMap.put("Скарина", "Александра");
        lastNameMap.put("Карепина", "Александра");
        lastNameMap.put("Иванов", "Иван");
        lastNameMap.put("Шайкин", "Игорь");
        lastNameMap.put("Морозова", "Светлана");
        lastNameMap.put("Никонова", "Светлана");
        lastNameMap.put("Дмитриев", "Алексей");
        lastNameMap.put("Новиков", "Дмитрий");
        return lastNameMap;

    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        //напишите тут ваш код
        int count = 0;
        for (Map.Entry<String, String> entr: map.entrySet()) {
            if(entr.getValue().equals(name)){
                count++;
            }
        }
        return count;

    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        //напишите тут ваш код
        int count = 0;
        for (Map.Entry<String, String> entr: map.entrySet()) {
            if(entr.getKey().equals(lastName)){
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {


    }
}
