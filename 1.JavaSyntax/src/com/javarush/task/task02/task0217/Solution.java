package com.javarush.task.task02.task0217;

/* 
Минимум четырех чисел
*/
public class Solution {
    public static int min(int a, int b, int c, int d) {
        //напишите тут ваш код
        int result;
        int min1 = min(a, b);
        int min2 = min(c, d);
        if(min1 > min2) result = min2;
        else result = min1;
        return result;

    }

    public static int min(int a, int b) {
        //напишите тут ваш код
        int c;
        if (a>b) c = b;
        else c = a;
        return c;

    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(-20, -10));
        System.out.println(min(-40, -10, -30, 40));
        System.out.println(min(-20, -40, -30, 40));
        System.out.println(min(-20, -10, -40, 40));
        System.out.println(min(-20, -10, -30, -40));
    }
}