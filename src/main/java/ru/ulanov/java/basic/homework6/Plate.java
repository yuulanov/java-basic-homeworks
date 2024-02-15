package ru.ulanov.java.basic.homework6;

import java.sql.SQLOutput;

public class Plate {
    private  int size;
    private int quantityMeal;
    public int eats;

    public int getEats() {
        return eats;
    }
    public void setEats(int eats) {
        this.eats = eats;
    }
    public Plate(int size, int quantityMeal) {
        this.size = size;
        this.quantityMeal = quantityMeal;
    }
    public int getSize() {
        return size;
    }
    public int getQuantityMeal() {
        return quantityMeal;
    }
    public void setQuantityMeal(int quantityMeal) {
        this.quantityMeal = quantityMeal;
    }
    public void plateInfo() {
        quantityMeal -= eats;
    }

    public void addFood (int pieces){
        pieces += quantityMeal;
        if (quantityMeal >= size) {
            quantityMeal = size;
            System.out.println("Тарелка полная");
        }
        else quantityMeal += pieces;
        System.out.println("В тарелке " + quantityMeal + " еды");

    }

}
