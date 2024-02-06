package ru.ulanov.java.basic.homeworks3;

public class homework {

    public static void main(String[] args) {
        sumOfPositiveElement(3);
        sQuare(5);
        diagonalZero(4);
        findMax(3);
        sumSecondElements(1);
    }
    /** Реализовать метод sumOfPositiveElements(..), принимающий в качестве аргумента
     целочисленный двумерный массив, метод должен посчитать и вернуть сумму всех элементов
     массива, которые больше 0*/
    public static void sumOfPositiveElement(int a) {
        int[][] array = new int[a][a];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = (int) (Math.random() * 9);
            }
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] > 0) {
                    sum += array[i][j];
                }
            }
        }
        System.out.println(sum);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
    /**Реализовать метод, который принимает в качестве аргумента int size и печатает в консоль
    квадрат из символов * со сторонами соответствующей длины;*/
    public static void sQuare(int size) {
        int[][] arr = new int[size][size];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print("*" + "  ");
            }
            System.out.println();
        }
    }
   /**Реализовать метод, принимающий в качестве аргумента двумерный целочисленный массив,
   и зануляющий его диагональные элементы (можете выбрать любую из диагоналей, или занулить обе)*/
    public static void diagonalZero(int size) {

        int[][] arr = new int[size][size];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
               arr[i][j] = 1;
               if (i == j) {
                   arr[i][j] = 0;
               }
               System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }
    /**Реализовать метод findMax(int[][] array) который должен найти и вернуть максимальный элемент массива*/
    public static void findMax(int a) {
        int[][] array = new int[a][a];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = (int) (Math.random() * 9);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        System.out.println(max);
    }
    /**Реализуйте метод, который считает сумму элементов второй строки двумерного массива,
    если второй строки не существует, то в качестве результата необходимо вернуть -1*/
    public static void sumSecondElements(int a) {
        int[][] array = new int[a][a];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = (int) ((Math.random() * 9) + 1);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == 1) {
                    sum += array[i][j];
                }
                if (array.length <= 1) {
                    sum = -1;
                }
            }
        }
        System.out.println(sum);
    }
}