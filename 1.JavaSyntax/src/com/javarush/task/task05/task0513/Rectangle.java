package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник
*/

public class Rectangle {
    //напишите тут ваш код
    int top, left, width, height;
    public void initialize(int top){
        this.top = top;
        left = 2;
        width = 3;
        height = 5;
    }
    public void initialize(int top, int left){
        this.top = top;
        this.left = left;
        width = 3;
        height = 5;
    }
    public void initialize(int top, int left, int width){
        this.top = top;
        this.left = left;
        this.width = width;
        height = 5;

    }
    public void initialize(int top, int left, int width, int height){
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }

    public static void main(String[] args) {

    }
}
