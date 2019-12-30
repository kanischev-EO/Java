package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        //напишите тут ваш код
        Map<String, String> mapa = new HashMap<>();
        mapa.put("Новиков", "Евгений");
        mapa.put("Мигунов", "Андрей");
        mapa.put("Васькин", "Андрей");
        mapa.put("Шайкин", "Евгений");
        mapa.put("Гусар", "Евгений");
        mapa.put("Иванов", "Евгений");
        mapa.put("Гусар", "Олег");
        mapa.put("Бедов", "Олег");
        mapa.put("Ковалев", "Максим");
        mapa.put("Васькин", "Евгений");

        return mapa;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
