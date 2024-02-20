package ru.ulanov.java.basic.homework6;

import java.sql.SQLOutput;

public class Plate {
    private int maxFoodQuant;
    private int currentFoodQuant;

    public Plate(int maxFoodQuant) {
        this.maxFoodQuant = maxFoodQuant;
        this.currentFoodQuant = currentFoodQuant;
    }


    public void addFoodInPlate(int foodQuant) {
        if (this.currentFoodQuant + foodQuant < this.maxFoodQuant) {
            this.currentFoodQuant += foodQuant;
        } else {
            this.currentFoodQuant = this.maxFoodQuant;
        }
    }

    public boolean decreaseFoodInPlate(int eatQuant) {
        if ((this.currentFoodQuant - eatQuant) >= 0) {
            this.currentFoodQuant -= eatQuant;
            return true;
        } else {
            return false;
        }
    }

}

