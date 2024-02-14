package ru.ulanov.java.basic.homeworks5;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat("Pushok", 2, 0, 100);
        Dog dog = new Dog("Sharik", 4, 1, 100);
        Horse horse = new Horse("Zorka", 8, 2, 100);

        cat.swim(4);
        cat.info();
        dog.swim(5);
        dog.info();
        horse.swim(40);
        horse.info();
        horse.swim(7);
        cat.run(5);
        cat.info();
        dog.run(10);
        dog.info();
        horse.run(100);
        horse.info();
    }
}
