package ru.ulanov.java.basic.homeworks.homework1;

public class Lesson1homework {

    public static void main(String[] args) {
        greetings();
        checkSign();
        selectColor();
        compareNumbers();
        addOrSubtractAndPrint(8, 5, false);
    }
    public static void greetings() {
        System.out.println("Hello\nWorld\nfrom\nJava");
    }

    public static void checkSign() {
        int a = 2;
        int b = -5;
        int c = a + b;
        System.out.println(c);
        if (c >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
    public static void selectColor() {
        int data = -5;
        if (data <= 10) {
            System.out.println("Красный");
        }
        if (data > 10 && data <= 20) {
            System.out.println("Желтый");
        }
        if (data > 10) {
            System.out.println("Зеленый");
        }
    }
    public static void compareNumbers() {
        int a = 1;
        int b = 7;
        if (a >= b) {
            System.out.println("a>=b");
        }
        if (a <= b) {
            System.out.println("a<=b");
        }
    }
    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        if (increment) {
            System.out.println(initValue + delta);
        }
        if (!increment) {
            System.out.println(initValue - delta);
        }
    }
}



