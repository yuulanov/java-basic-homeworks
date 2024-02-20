package ru.ulanov.java.basic.homework6;

public class Cat {
    private String name;
    private int appetite;
    public Boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public void info() {
        System.out.println("У кота " + name + " аппетит " + appetite + " и насыщенность " + satiety);
    }

    public void toEat(Plate plate) {
        if (!satiety) {
            if (plate.decreaseFoodInPlate(appetite)) {
                satiety = true;
            }

        }
    }

    public static void feedCats(Cat[] cats, Plate plate) {
        for (int i = 0; i < cats.length; i++) {
            cats[i].toEat(plate);
            cats[i].info();
        }
    }
}
