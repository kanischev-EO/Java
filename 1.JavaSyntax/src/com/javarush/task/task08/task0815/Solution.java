package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> namesPeople = new HashMap<>();
        namesPeople.put("Канищев", "Евгений");
        namesPeople.put("Бедов", "Андрей");
        namesPeople.put("Никонова", "Светлана");
        namesPeople.put("Стрикаленко", "Дмитрий");
        namesPeople.put("Гусар", "Михаил");
        namesPeople.put("Шайкин", "Игорь");
        namesPeople.put("Новиков", "Дмитрий");
        namesPeople.put("Канищев", "Николай");
        namesPeople.put("Дмитриев", "Алексей");
        namesPeople.put("Иванов", "Михаил");
        return  namesPeople;

    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        //напишите тут ваш код
        int countSameName = 0;
        for (Map.Entry<String, String> names : map.entrySet()) {
            if(name.equalsIgnoreCase(names.getValue()))countSameName++;
        }
        return countSameName;

    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        //напишите тут ваш код
        int countSameLastName = 0;
        for (Map.Entry<String, String> names : map.entrySet()) {
            if(lastName.equalsIgnoreCase(names.getKey()))countSameLastName++;
        }
        return countSameLastName;

    }

    public static void main(String[] args) {

    }
}
