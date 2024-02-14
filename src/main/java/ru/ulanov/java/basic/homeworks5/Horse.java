package ru.ulanov.java.basic.homeworks5;

public class Horse extends Animal{
    public Horse(String name, int runSpeed, int swimSpeed, int endurance) {
        super(name, runSpeed, swimSpeed, endurance);
    }
    @Override
    public void swim(int distance) {
        System.out.println(getName() + " потратил " + distance / getSwimSpeed() + " сек. " + "чтобы проплыть " + distance + " метров");
        if (endurance - distance * 4 <= 0) {
            endurance = -1;
        } else {
            endurance -= distance * 4;
        }
    }
}
