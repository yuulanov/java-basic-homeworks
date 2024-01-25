package ru.ulanov.java.basic.homeworks2;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        printConsole(3, "Hello world");
        sumArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        fulArr(7, 10);
        arrUp(3, 2, 5);
        halfSumArr(7, 8);
    }
    public static void printConsole(int a, String phrase) {
        for (int i = 0; i < a; i++) {
            System.out.println(phrase);
        }
    }
    public static void sumArray(int[] array) {
        int d = 0;
        for (int j : array)
            if (j >= 5)
                d += j;
        //int d = 0;
        System.out.println(d);
    }
    public static void fulArr(int i, int c) {
        int[] arr = new int[i];
        for (i = 0; i < arr.length; i++) {
            arr[i] = c;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void arrUp(int i, int a, int b) {
        int[] arr = new int[i];
        for (i = 0; i < arr.length; i++)
            arr[i] = a;
        for (i = 0; i < arr.length; i++)
            arr[i] += b;
        System.out.println(Arrays.toString(arr));
    }
    public static void halfSumArr(int i, int a) {
        int b = 0;
        int c = 0;
        int[] arr = new int[i];
        for (i = 0; i < arr.length; i++)
            arr[i] = a;
        for (i = 0; i < 1 / 2 * arr.length; i++)
            b += arr[i];
        for (i = 0; i > 1 / 2 * arr.length; i++)
            c += arr[i];
        if (b > c) {
            System.out.println("Левая часть массива больше чем правая");
        } else {
            System.out.println("Правая часть массива больше чем правая");
        }
    }
}









