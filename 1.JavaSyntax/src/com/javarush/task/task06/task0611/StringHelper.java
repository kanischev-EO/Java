package com.javarush.task.task06.task0611;

/* 
Класс StringHelper
*/

public class StringHelper {
    public static String multiply(String s) {
        String result = s + s + s + s +s;
        //напишите тут ваш код
        return result;
    }

    public static String multiply(String s, int count) {
        String result = "";
       for(int i = 0; i< count; i++){
            result +=s ;;
       }
       return result;
        //напишите тут ваш код
    }

    public static void main(String[] args) {
        StringHelper.multiply("AMIGO", 2);

    }
}
