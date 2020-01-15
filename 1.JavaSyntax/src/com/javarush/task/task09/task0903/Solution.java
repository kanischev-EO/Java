package com.javarush.task.task09.task0903;

/* 
Кто меня вызывал?
*/

public class Solution {
    public static void main(String[] args) {
        method1();
    }

    public static int method1() {
        method2();

        System.out.println("method1 " + Thread.currentThread().getStackTrace()[2].getLineNumber());
        return Thread.currentThread().getStackTrace()[2].getLineNumber();
    }

    public static int method2() {
        method3();
        System.out.println("method2 " + Thread.currentThread().getStackTrace()[2].getLineNumber());
        return Thread.currentThread().getStackTrace()[2].getLineNumber();
    }

    public static int method3() {
        method4();
        System.out.println("method3 " + Thread.currentThread().getStackTrace()[2].getLineNumber());
        return Thread.currentThread().getStackTrace()[2].getLineNumber();
    }

    public static int method4() {
        method5();
        System.out.println("method4 " + Thread.currentThread().getStackTrace()[2].getLineNumber());
        return Thread.currentThread().getStackTrace()[2].getLineNumber();
    }

    public static int method5() {
        StackTraceElement[] element = Thread.currentThread().getStackTrace();
        System.out.println("name method 5 " + element[1].getMethodName());
        System.out.println("method5 "+ element[1].getLineNumber());
        return element[1].getLineNumber();
    }
}
