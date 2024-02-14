package ru.ulanov.java.basic.homeworks5;

public class Animal {
    private final String name;
    private final int runSpeed;
    private final int swimSpeed;
    public int endurance;

    public Animal(String name, int runSpeed, int swimSpeed, int endurance) {
        this.name = name;
        this.runSpeed = runSpeed;
        this.swimSpeed = swimSpeed;
        this.endurance = endurance;
    }

    public String getName() {
        return name;
    }

    public int getRunSpeed() {
        return runSpeed;
    }

    public int getSwimSpeed() {
        return swimSpeed;
    }

    public int getEndurance() {
        return endurance;
    }

    public void run(int distance) {
        System.out.println(name + " потратил " + distance / runSpeed + " сек. " + "чтобы пробежать " + distance + " метров");
        if (endurance - distance <= 0) {
            endurance = -1;
        } else {
            endurance -= distance;
        }
    }

    public void swim(int distance) {
        if (swimSpeed == 0) {
            System.out.println(name + " не умеет плавать");
            return;
        }
        System.out.println(name + " потратил " + distance / swimSpeed + " сек. " + "чтобы проплыть " + distance + " метров");
        info();
    }

    public void info() {
        if (endurance == -1) {
            System.out.println(endurance + " У животного " + name + " нет сил");
        } else {
            System.out.println("У " + name + " осталось " + endurance + " ед. выносливости");
        }
    }
}
