package ru.ulanov.java.basic.homeworks5;

public class Dog extends Animal {
    public Dog(String name, int runSpeed, int swimSpeed, int endurance) {
        super(name, runSpeed, swimSpeed, endurance);
    }
    @Override
    public void swim(int distance) {
        System.out.println(getName() + " потратил " + distance / getSwimSpeed() + " сек. " + "чтобы проплыть " + distance + " метров");
        if (getEndurance() - distance * 2 <= 0) {
            endurance = -1;
        } else {
            endurance -= distance * 2;
        }
    }
}