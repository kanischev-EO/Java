package com.javarush.task.task05.task0520;

/* 
Создать класс прямоугольник (Rectangle)
*/


public class Rectangle {
    //напишите тут ваш код
    int  top, left, width, height;

    public Rectangle(int top, int left, int width, int height) {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
        this.top = 0;
        this.left = 0;
    }
    public Rectangle(Rectangle rectangle) {
        this.width = rectangle.width;
        this.height = rectangle.width;
        this.top = rectangle.top;
        this.left = rectangle.left;
    }

    public Rectangle(int top, int left, int width) {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = 0;
    }

    public static void main(String[] args) {

    }
}
