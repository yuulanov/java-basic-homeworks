package ru.ulanov.java.basic.homework6;

public class Main {
    public static void main(String[] args) {
        Plate plate = new Plate(90);
        Cat[] cats = {
                new Cat("Murzik", 50),
                new Cat("Barsik", 30),
                new Cat("Pushok", 40)
        };
        feedCats(cats, plate);
        plate.info();
        plate.addFoodInPlate(20);
    }
    public static void feedCats(Cat[] cats, Plate plate) {
        for (int i = 0; i < cats.length; i++) {
            cats[i].toEat(plate);
            cats[i].info();
        }
    }
}
