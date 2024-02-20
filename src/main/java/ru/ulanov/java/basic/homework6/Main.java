package ru.ulanov.java.basic.homework6;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Murzik", 100);
        Plate plate = new Plate(70, 70);

        cat1.info();
        //plate.plateInfo();
        plate.decreaseFood();
        cat1.toEat();
        cat1.info();
        plate.plateInfo();
        plate.addFood(10);
        plate.plateInfo();


    }












}
