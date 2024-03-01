package ru.ulanov.java.basic.homework8;

import java.lang.reflect.Array;

import static java.awt.geom.Path2D.contains;

public class Main {
    public static void main(String[] args) {
        arr(4);
    }

    public static void arr(int a) {
        String[][] arrayStr = new String[a][a];
        if (arrayStr.length != 4) {
            throw new AppArraySizeException("Размер массива не соответствует");
        }
        int[][] arrayNum = new int[arrayStr.length][arrayStr.length];

        for (int i = 0; i < arrayNum.length; i++) {
            for (int j = 0; j < arrayNum.length; j++) {
                //arrayNum[i][j] = Integer.parseInt(arrayStr[i][j]);
                arrayNum[i][j] = (int) (Math.random() * 4);


                System.out.print(arrayNum[i][j] + " ");
            }
            System.out.println();
        }
        int sumArr = 0;
        for (int i = 0; i < arrayNum.length; i++) {
            for (int j = 0; j < arrayNum.length; j++) {
                String str = String.valueOf(arrayNum[i][j]);


                sumArr += arrayNum[i][j];
            }
        }
        System.out.println(sumArr);
    }
}







