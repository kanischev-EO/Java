package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> nameFullname = new HashMap<>();
        nameFullname.put("Пупкин", "Василий");
        nameFullname.put("Бупкин", "Генадий");
        nameFullname.put("Гупкин", "Петр");
        nameFullname.put("Упкин", "Сергей");
        nameFullname.put("Нупкин", "Евгений");
        nameFullname.put("Супкин", "Гнаий");
        nameFullname.put("Снуппи", "Ген");
        nameFullname.put("Валли", "Генади");
        nameFullname.put("Гайяна", "Генадй");
        nameFullname.put("Кент", "Гнадий");
        return nameFullname;

    }

    public static void getCountTheSameFirstName(Map<String, String> map, String name) {
        //напишите тут ваш код



    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        //напишите тут ваш код
return 0;
    }

    public static void main(String[] args) {

    }
}
